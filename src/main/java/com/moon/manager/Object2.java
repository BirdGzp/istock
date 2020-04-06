package com.moon.manager;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager
 * @Description: TODO
 * @date Date : 2020年04月02日 13:35
 */
@Data
public class Object2
{
	public static final String MALE = "男";
	public static final String FEMALE = "女";
	private String accountId;

	private int sex;

	private String validData;

	private String nationality;

	public static Object2 getObject2(String line)
	{
		String[] datas = line.split("\t");
		Object2 obj = new Object2();
		obj.setAccountId(datas[0]);
		obj.setSex(MALE.equalsIgnoreCase(datas[2]) ? 0 : 1);
		if (datas.length > Integer.valueOf(2))
		{
			obj.setValidData(datas[2]);
		}
		if (datas.length > Integer.valueOf(3))
		{
			obj.setNationality(datas[3]);
		}
		return obj;
	}

}
