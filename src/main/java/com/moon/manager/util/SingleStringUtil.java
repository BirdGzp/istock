package com.moon.manager.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: gongzhipeng
 * @Date: 2020/7/30 8:11 下午
 * @Description:
 * @Project: istock
 * @Package com.moon.manager.util
 */
public class SingleStringUtil
{
	public static String getLowerMd5(String key) throws NoSuchAlgorithmException
	{
		//结果字符串
		String result = "";

			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(key.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
				{
					i += 256;
				}

				if (i < 16)
				{
					buf.append("0");
				}
				buf.append(Integer.toHexString(i));
			}
			result = buf.toString();
			System.out.println("MD5(" + key + ",16小写) = " + buf.toString().substring(8, 24));
			System.out.println("MD5(" + key + ",16大写) = " + buf.toString().substring(8, 24).toUpperCase());

		return result;
	}


	public static String getUpperMD5(String key) throws NoSuchAlgorithmException
	{
		return getLowerMd5(key).toUpperCase();
	}


	public static String get16LowerMD5(String key) throws NoSuchAlgorithmException
	{
		return getLowerMd5(key).substring(8, 24);
	}

	public static String get16UpperMD5(String key) throws NoSuchAlgorithmException
	{
		return getLowerMd5(key).substring(8, 24).toUpperCase();
	}

	/**
	 * 格式化
	 * @param jsonStr
	 * @return
	 */
	public static String formatJson(String jsonStr) {
		if (null == jsonStr || "".equals(jsonStr)) return "";
		StringBuilder sb = new StringBuilder();
		char last = '\0';
		char current = '\0';
		int indent = 0;
		for (int i = 0; i < jsonStr.length(); i++) {
			last = current;
			current = jsonStr.charAt(i);

			//遇到{ [换行，且下一行缩进
			switch (current) {
				case '{':
				case '[':
					sb.append(current);
					sb.append('\n');
					indent++;
					addIndentBlank(sb, indent);
					break;

				//遇到} ]换行，当前行缩进
				case '}':
				case ']':
					sb.append('\n');
					indent--;
					addIndentBlank(sb, indent);
					sb.append(current);
					break;

				//遇到,换行
				case ',':
					sb.append(current);
					if (last != '\\') {
						sb.append('\n');
						addIndentBlank(sb, indent);
					}
					break;
				default:
					sb.append(current);
			}
		}

		return sb.toString();
	}

	/**
	 * 添加space
	 * @param sb
	 * @param indent
	 */
	private static void addIndentBlank(StringBuilder sb, int indent) {
		for (int i = 0; i < indent; i++) {
			sb.append('\t');
		}
	}


	public static void main(String[] args)
	{
		System.out.println(formatJson("{\n"
				+ "\t\"str\":123,\n"
				+ "\t\"int\":\"1234\"\n"
				+ "}\n"));
	}
}
