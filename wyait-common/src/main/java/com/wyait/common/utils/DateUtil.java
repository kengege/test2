package com.wyait.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
	public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public static Date parse(String string) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		return format.parse(string);
	}

	public static String format(Date date) {
		SimpleDateFormat format = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		return format.format(date);
	}

}
