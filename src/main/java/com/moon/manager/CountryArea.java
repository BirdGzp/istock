package com.moon.manager;

import org.apache.commons.lang3.StringUtils;

import lombok.Getter;

/**
 *
 * 国家枚举
 *
 * @author hzzhongtingjie
 * @version $ Check.java, 2016年9月12日 hzzhongtingjie $
 */
@Getter
public enum CountryArea
{
	/** 中国大陆 */
	C2("C2", "CHN", "中国大陆"),
	CN("CN", "CHN", "中国大陆"),
	HK("HK", "HKG", "香港"),
	MO("MO", "MAC", "澳门"),
	TW("TW", "TWN", "台湾"),
	AL("AL", "ALB", "阿尔巴尼亚"),
	DZ("DZ", "DZA", "阿尔及利亚"),
	AR("AR", "ARG", "阿根廷"),
	AE("AE", "ARE", "阿拉伯联合酋长国"),
	AW("AW", "ABW", "阿鲁巴"),
	OM("OM", "OMN", "阿曼"),
	AZ("AZ", "AZE", "阿塞拜疆共和国"),
	EG("EG", "EGY", "埃及"),
	ET("ET", "ETH", "埃塞俄比亚"),
	IE("IE", "IRL", "爱尔兰"),
	EE("EE", "EST", "爱沙尼亚"),
	AD("AD", "AND", "安道尔"),
	AO("AO", "AGO", "安哥拉"),
	AI("AI", "AIA", "安圭拉"),
	AG("AG", "ATG", "安提瓜岛和巴布达岛"),
	AT("AT", "AUT", "奥地利"),
	AU("AU", "AUS", "澳大利亚"),
	BB("BB", "BRB", "巴巴多斯"),
	PG("PG", "PNG", "巴布亚新几内亚"),
	BS("BS", "BHS", "巴哈马"),
	PY("PY", "PRY", "巴拉圭"),
	BH("BH", "BHR", "巴林"),
	PA("PA", "PAN", "巴拿马"),
	BR("BR", "BRA", "巴西"),
	BY("BY", "BLR", "白俄罗斯"),
	BM("BM", "BMU", "百慕大"),
	BG("BG", "BGR", "保加利亚"),
	BJ("BJ", "BEN", "贝宁"),
	BE("BE", "BEL", "比利时"),
	IS("IS", "ISL", "冰岛"),
	PL("PL", "POL", "波兰"),
	BA("BA", "BIH", "波斯尼亚和黑塞哥维那"),
	BO("BO", "BOL", "玻利维亚"),
	BZ("BZ", "BLZ", "伯利兹"),
	BW("BW", "BWA", "博茨瓦纳"),
	BT("BT", "BTN", "不丹"),
	BF("BF", "BFA", "布基纳法索"),
	BI("BI", "BDI", "布隆迪"),
	DK("DK", "DNK", "丹麦"),
	DE("DE", "DEU", "德国"),
	TG("TG", "TGO", "多哥"),
	DM("DM", "DOM", "多米尼加"),
	DO("DO", "DOM", "多米尼加共和国"),
	RU("RU", "RUS", "俄罗斯"),
	EC("EC", "ECU", "厄瓜多尔"),
	ER("ER", "ERI", "厄立特里亚"),
	FR("FR", "FRA", "法国"),
	FO("FO", "FRO", "法罗群岛"),
	PF("PF", "PYF", "法属波利尼西亚"),
	GF("GF", "GUF", "法属圭亚那"),
	VA("VA", "VAT", "梵蒂冈"),
	PH("PH", "PHL", "菲律宾"),
	FJ("FJ", "FJI", "斐济"),
	FI("FI", "FIN", "芬兰"),
	CV("CV", "CPV", "佛得角"),
	FK("FK", "FLK", "福克兰群岛"),
	GM("GM", "GMB", "冈比亚"),
	CG("CG", "COG", "刚果共和国"),
	CD("CD", "COD", "刚果民主共和国"),
	CO("CO", "COL", "哥伦比亚"),
	CR("CR", "CRI", "哥斯达黎加"),
	GD("GD", "GRD", "格拉纳达"),
	GL("GL", "GRL", "格陵兰"),
	GE("GE", "GEO", "格鲁吉亚"),
	GP("GP", "GLP", "瓜德罗普"),
	GY("GY", "GUY", "圭亚那"),
	KZ("KZ", "KAZ", "哈萨克斯坦"),
	KR("KR", "KOR", "韩国"),
	NL("NL", "NLD", "荷兰"),
	AN("AN", "ANT", "荷兰安的列斯群岛"),
	ME("ME", "MNE", "黑山"),
	HN("HN", "HND", "洪都拉斯"),
	KI("KI", "KIR", "基里巴斯"),
	DJ("DJ", "DJI", "吉布提"),
	KG("KG", "KGZ", "吉尔吉斯斯坦"),
	GN("GN", "GIN", "几内亚"),
	GW("GW", "GNB", "几内亚比绍"),
	CA("CA", "CAN", "加拿大"),
	GA("GA", "GAB", "加蓬共和国"),
	KH("KH", "KHM", "柬埔寨"),
	CZ("CZ", "CZE", "捷克共和国"),
	ZW("ZW", "ZWE", "津巴布韦"),
	CM("CM", "CMR", "喀麦隆"),
	QA("QA", "QAT", "卡塔尔"),
	KY("KY", "CYM", "开曼群岛"),
	KM("KM", "COM", "科摩罗"),
	CI("CI", "CIV", "科特迪瓦"),
	KW("KW", "KWT", "科威特"),
	HR("HR", "HRV", "克罗地亚"),
	KE("KE", "KEN", "肯尼亚"),
	CK("CK", "COK", "库可群岛"),
	LV("LV", "LVA", "拉脱维亚"),
	LS("LS", "LSO", "莱索托"),
	LA("LA", "LAO", "老挝"),
	LT("LT", "LTU", "立陶宛"),
	LI("LI", "LIE", "列支敦士登"),
	RE("RE", "REU", "留尼汪岛"),
	LU("LU", "LUX", "卢森堡"),
	RW("RW", "RWA", "卢旺达"),
	RO("RO", "ROU", "罗马尼亚"),
	MG("MG", "MDG", "马达加斯加"),
	MV("MV", "MDV", "马尔代夫"),
	MT("MT", "MLT", "马耳他"),
	MW("MW", "MWI", "马拉维"),
	MY("MY", "MYS", "马来西亚"),
	ML("ML", "MLI", "马里"),
	MK("MK", "MKD", "马其顿"),
	MH("MH", "MHL", "马绍尔群岛"),
	MQ("MQ", "MTQ", "马提尼克"),
	YT("YT", "MYT", "马约特"),
	MU("MU", "MUS", "毛里求斯"),
	MR("MR", "MRT", "毛里塔尼亚"),
	US("US", "USA", "美国"),
	MN("MN", "MNG", "蒙古"),
	MS("MS", "MSR", "蒙特塞拉特"),
	PE("PE", "PER", "秘鲁"),
	FM("FM", "FSM", "密克罗尼西亚"),
	MD("MD", "MDA", "摩尔多瓦"),
	MA("MA", "MAR", "摩洛哥"),
	MC("MC", "MCO", "摩纳哥"),
	MZ("MZ", "MOZ", "莫桑比克"),
	MX("MX", "MEX", "墨西哥"),
	NA("NA", "NAM", "纳米比亚"),
	ZA("ZA", "ZAF", "南非"),
	NR("NR", "NRU", "瑙鲁"),
	NP("NP", "NPL", "尼泊尔"),
	NI("NI", "NIC", "尼加拉瓜"),
	NE("NE", "NER", "尼日尔"),
	NG("NG", "NGA", "尼日利亚"),
	NU("NU", "NIU", "纽埃"),
	NO("NO", "NOR", "挪威"),
	NF("NF", "NFK", "诺福克岛"),
	PW("PW", "PLW", "帕劳"),
	PN("PN", "PCN", "皮特克恩群岛"),
	PT("PT", "PRT", "葡萄牙"),
	JP("JP", "JPN", "日本"),
	SE("SE", "SWE", "瑞典"),
	CH("CH", "CHE", "瑞士"),
	SV("SV", "SLV", "萨尔瓦多"),
	WS("WS", "WSM", "萨摩亚"),
	RS("RS", "SRB", "塞尔维亚"),
	SL("SL", "SLE", "塞拉利昂"),
	SN("SN", "SEN", "塞内加尔"),
	CY("CY", "CYP", "塞浦路斯"),
	SC("SC", "SYC", "赛舌尔"),
	SA("SA", "SAU", "沙特阿拉伯"),
	ST("ST", "STP", "圣多美和普林西比"),
	SH("SH", "SHN", "圣赫勒拿"),
	KN("KN", "KNA", "圣基茨和尼维斯安圭拉"),
	LC("LC", "LCA", "圣卢西亚"),
	SM("SM", "SMR", "圣马力诺"),
	PM("PM", "SPM", "圣皮埃尔岛和密克隆岛"),
	VC("VC", "VCT", "圣文森特和格林纳丁斯群岛"),
	LK("LK", "LKA", "斯里兰卡"),
	SK("SK", "SVK", "斯洛伐克"),
	SI("SI", "SVN", "斯洛文尼亚"),
	SJ("SJ", "SJM", "斯瓦尔巴和扬马延群岛"),
	SZ("SZ", "SWZ", "斯威士兰"),
	SR("SR", "SUR", "苏里南"),
	SB("SB", "SLB", "所罗门群岛"),
	SO("SO", "SOM", "索马里"),
	TJ("TJ", "TJK", "塔吉克斯坦"),
	TH("TH", "THA", "泰国"),
	TZ("TZ", "TZA", "坦桑尼亚"),
	TO("TO", "TON", "汤加"),
	TC("TC", "TCA", "特克斯和凯科斯群岛"),
	TT("TT", "TTO", "特立尼达和多巴哥"),
	TN("TN", "TUN", "突尼斯"),
	TV("TV", "TUV", "图瓦卢"),
	TR("TR", "TUR", "土耳其"),
	TM("TM", "TKM", "土库曼斯坦"),
	WF("WF", "WLF", "瓦利斯和富图纳群岛"),
	VU("VU", "VUT", "瓦努阿图"),
	GT("GT", "GTM", "危地马拉"),
	VE("VE", "VEN", "委内瑞拉"),
	BN("BN", "BRN", "文莱"),
	UG("UG", "UGA", "乌干达"),
	UA("UA", "UKR", "乌克兰"),
	UY("UY", "URY", "乌拉圭"),
	ES("ES", "ESP", "西班牙"),
	GR("GR", "GRC", "希腊"),
	SG("SG", "SGP", "新加坡"),
	NC("NC", "NCL", "新喀里多尼亚"),
	NZ("NZ", "NZL", "新西兰"),
	HU("HU", "HUN", "匈牙利"),
	JM("JM", "JAM", "牙买加"),
	AM("AM", "ARM", "亚美尼亚"),
	YE("YE", "YEM", "也门"),
	IL("IL", "ISR", "以色列"),
	IT("IT", "ITA", "意大利"),
	IN("IN", "IND", "印度"),
	ID("ID", "IDN", "印度尼西亚"),
	GB("GB", "GBR", "英国"),
	VG("VG", "VGB", "英属维尔京群岛"),
	JO("JO", "JOR", "约旦"),
	VN("VN", "VNM", "越南"),
	ZM("ZM", "ZMB", "赞比亚"),
	TD("TD", "TCD", "乍得"),
	GI("GI", "GIB", "直布罗陀"),
	CL("CL", "CHL", "智利"),
	KP("KP", "PRK", "朝鲜"),
	UZ("UZ", "UZB", "乌兹别克斯坦"),
	CG1("CG", "COD", "刚果"),
	HK2("HK", "HKG", "港澳居民居住证"),
	MM("MM", "MMR","缅甸");

	private String descCn;

	private String descEn;

	private String descEn3Digits;

	/**
	 * 根据是否判断获取是否判断类型
	 * @param descEn
	 * @return
	 */
	public static CountryArea getCountryAreaByDescEn(final String descEn)
	{
		if (descEn == null)
		{
			return null;
		}
		CountryArea[] countryAreas = CountryArea.values();
		for (CountryArea countryArea : countryAreas)
		{
			if (descEn.equals(countryArea.getDescEn()))
			{
				return countryArea;
			}
		}
		return null;
	}

	/**
	 * 使用两位代码或国家全称获取国家三位代码
	 * @param text 国家两位代码或全称
	 * @return 国家三位代码
	 */
	public static String get3DigitsCodeByAny(String text)
	{
		if (StringUtils.isBlank(text))
		{
			return StringUtils.EMPTY;
		}

		CountryArea[] countryAreas = CountryArea.values();
		for (CountryArea countryArea : countryAreas)
		{
			if (countryArea.descEn.equalsIgnoreCase(text))
			{
				return countryArea.getDescEn3Digits();
			}

			if (countryArea.descCn.equalsIgnoreCase(text))
			{
				return countryArea.getDescEn3Digits();
			}
		}
		return StringUtils.EMPTY;
	}

	/**
	 * 获取国家区域全称
	 *
	 * @param text 国家区域两位或三位代码
	 * @return 国家区域全称
	 */
	public static String getFullNameByAny(String text)
	{
		if (StringUtils.isBlank(text))
		{
			return StringUtils.EMPTY;
		}

		CountryArea[] countryAreas = CountryArea.values();
		for (CountryArea countryArea : countryAreas)
		{
			if (countryArea.descEn.equalsIgnoreCase(text))
			{
				return countryArea.getDescCn();
			}

			if (countryArea.descEn3Digits.equalsIgnoreCase(text))
			{
				return countryArea.getDescCn();
			}
		}
		return text;
	}

	/**
	 * 使用两位代码或国家全称获取国家三位代码
	 * @param text 国家两位代码或全称
	 * @return 国家三位代码
	 */
	public static boolean has3DigitsCodeByAny(String text)
	{
		if (StringUtils.isBlank(text))
		{
			return false;
		}

		CountryArea[] countryAreas = CountryArea.values();
		for (CountryArea countryArea : countryAreas)
		{
			if (countryArea.descEn.equalsIgnoreCase(text))
			{
				return true;
			}

			if (countryArea.descCn.equalsIgnoreCase(text))
			{
				return true;
			}
		}
		return false;
	}

	CountryArea(final String descEn, final String descEn3Digits, final String descCn)
	{
		this.descCn = descCn;
		this.descEn3Digits = descEn3Digits;
		this.descEn = descEn;
	}
}
