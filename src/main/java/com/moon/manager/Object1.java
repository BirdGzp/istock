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
public class Object1
{
	private String accountId;

	private int sex;

	private String nationality;

	private String time;

	public static Object1 getObject1(String line)
	{
		String[] datas = line.split("\t");
		Object1 obj = new Object1();
		obj.setAccountId(datas[0]);
		obj.setSex(StringUtils.isBlank(datas[1]) ? 0 : Integer.valueOf(datas[1]));
		if (datas.length > Integer.valueOf(2))
		{
			obj.setNationality(datas[2]);
		}
		if (datas.length > Integer.valueOf(3))
		{
			obj.setTime(datas[3]);
		}
		return obj;
	}

}
