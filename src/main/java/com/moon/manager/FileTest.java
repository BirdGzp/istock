package com.moon.manager;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager
 * @Description: TODO
 * @date Date : 2020年04月01日 21:25
 */
public class FileTest
{
	public static Map<String, Object1> object1Map = new HashMap();
	public static Map<String, Object2> object2Map = new HashMap();

	public static void test() throws IOException
	{
		File file = new File("F:\\test");
		if (!file.exists())
		{
			file.getParentFile().mkdirs();
		}
		FileOutputStream out = new FileOutputStream(file, true);
		ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024 * 30);
		while (true)
		{
			FileChannel outChannel = null;
			if (outChannel != null)
			{
				outChannel.close();
			}

			outChannel = out.getChannel();
			buffer.clear();
			String str = "12312";
			for (int i = 0; i < 100; i++)
			{
				str += "12312";
			}
			byte[] content = str.getBytes();
			buffer.put(content);
			buffer.flip();
			outChannel.write(buffer);

		}
	}

	public static void readFile()
	{
		try
		{
			FileReader fr = new FileReader("D:\\project\\java\\manager\\src\\main\\resources\\test");
			BufferedReader bf = new BufferedReader(fr);
			String str;
			// 按行读取字符串
			while ((str = bf.readLine()) != null)
			{
				try
				{
					Object1 obj = Object1.getObject1(str);
					if (object1Map.containsKey(obj.getAccountId()))
					{
												System.out.println("重复账号为：" + obj.getAccountId());
					}
					object1Map.put(obj.getAccountId(), obj);
				}
				catch (Exception e)
				{
					System.out.println(str  + " 异常 "  + object1Map.size());
					e.printStackTrace();
				}
			}
			System.out.println(object1Map.size()  + "   ");

			FileReader fr2 = new FileReader("D:\\project\\java\\manager\\src\\main\\resources\\test2");
			BufferedReader bf2 = new BufferedReader(fr2);
			String str2;
			// 按行读取字符串
			int i = 0;
			int x = 0;
			while ((str2 = bf2.readLine()) != null)
			{
				Object2 obj2 = Object2.getObject2(str2);
				if (object1Map.containsKey(obj2.getAccountId()))
				{
					i++;
					Object1 object1 = object1Map.get(obj2.getAccountId());
					String result = generateSQL(object1, obj2);
					if (result != null) {
						System.out.println(result);
					}

				}
				else
				{
					x++;
					//					System.out.println("未找到匹配的信息：" + obj2.getAccountId());
				}

			}
			System.out.println("匹配行数为:" + i);
			System.out.println("未匹配行号：" + x);

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	/**
	 *
	 * @param object1  数据库中的数据
	 * @param object2 人工数据
	 * @return
	 */
	public static final String generateSQL(Object1 object1, Object2 object2)
	{
		String nationality = CountryArea.get3DigitsCodeByAny(object2.getNationality());
		String validDate = getValidDate(object1.getTime(), object2.getValidData());
		if(StringUtils.isBlank(nationality))
		{
			System.out.println("未检测到的国籍 " + object2.getNationality() + object2.getAccountId());
		}
		String SQL = null;
		if (validDate == null)
		{

		}
		else
		{
			SQL = "UPDATE TB_ACCOUNT_OPTION_INFO SET TIME_TYPE = 1, NATIONALITY = '" + nationality + "', VALID_DATE = '"
					+ validDate + "' WHERE ACCOUNT_ID = '" + object1.getAccountId() + "';";
		}
		return SQL;
	}

	/**
	 *
	 * @param obj1Time 数据库中当前时间
	 * @param obj2Time  人工录入的时间
	 * @return
	 */
	public static String getValidDate(String obj1Time, String obj2Time)
	{
		Timestamp now = DateUtil.formatToTimestamp("2020/4/1", "yyyy/MM/dd");
		Timestamp timestamp2 = DateUtil.formatToTimestamp(obj2Time, "yyyyMMdd");
		/** 当前数据库中时间字段为 null， 直接用人工时间 */
		if (obj1Time == null)
		{
			/** 人工录入的时间小于的当前时间，不去更新有效期字段 */
			if (timestamp2.compareTo(now) < 0)
			{
				return null;
			}
			return DateUtil.formatTimestamp(timestamp2, DateUtil.FORMAT_YYYY_MM_DD_HH_MM_SS_MS);
		}
		/** 人工录入的时间小于的当前时间，不去更新有效期字段 */
		if (timestamp2.compareTo(now) < 0)
		{
			return null;
		}
		Timestamp timestamp = DateUtil.formatToTimestamp(obj1Time.split(" ")[0], DateUtil.FORMAT_YYYY_SLASH_MM_SLASH_DD);

		/** 人工录入的时间小于的当前时间，不去更新有效期字段 */
		if (timestamp2.compareTo(now) < 0)
		{
			return null;
		}
		/** 当前数据库中时间字段为 null， 直接用人工时间 */
		if (obj1Time == null)
		{
			return DateUtil.formatTimestamp(timestamp2, DateUtil.FORMAT_YYYY_MM_DD_HH_MM_SS_MS);
		}
		/** 哪个时间大使用哪个 */
		if (timestamp.compareTo(timestamp2) >= 0)
		{
			return DateUtil.formatTimestamp(timestamp, DateUtil.FORMAT_YYYY_MM_DD_HH_MM_SS_MS);
		}
		else
		{
			return DateUtil.formatTimestamp(timestamp2, DateUtil.FORMAT_YYYY_MM_DD_HH_MM_SS_MS);
		}
	}

	public static void main(String[] args)
	{
		readFile();
	}
}
