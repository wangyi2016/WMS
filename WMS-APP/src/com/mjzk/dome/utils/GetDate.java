package com.mjzk.dome.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
	/**
     * 获取日期字符串。
     * 
     * <pre>
     *  日期字符串格式： yyMMdd
     *  其中：
     *      yy     表示2位年。
     *      MM     表示2位月。
     *      dd     表示2位日。
     * </pre>
     * 
     * @return String "yyMMdd"格式的日期字符串。
     */
	 public static String getDate() {
		 SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");

		 return formatter.format(new Date());
		    }
	 
	 public static String StrToStr(String str) {
		   
		    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		    Date date = null;
		    String str2="";
		    try {
		     date = format.parse(str);
		     SimpleDateFormat formatter2 = new SimpleDateFormat("yyMMdd");
		     str2=formatter2.format(date);
		    } catch (ParseException e) {
		     e.printStackTrace();
		    }
		    return str2;
		 }
	 
	 public static String StrToStr2(String str) {
		   
		    SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
		    Date date = null;
		    String str2="";
		    try {
		     date = format.parse(str);
		     SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
		     str2=formatter2.format(date);
		    } catch (ParseException e) {
		     e.printStackTrace();
		    }
		    return str2;
		 }
	 public static String StrToStr3(String str) {
		   
		    SimpleDateFormat format = new SimpleDateFormat("yy");
		    Date date = null;
		    String str2="";
		    try {
		     date = format.parse(str);
		     SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy年");
		     str2=formatter2.format(date);
		    } catch (ParseException e) {
		     e.printStackTrace();
		    }
		    return str2;
		 }
	 /**
	 * 字符串转换成日期
	 * @param str
	 * @return date
	 */
	 public static Date StrToDate(String str) {
	   
	    SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
	    Date date = null;
	    try {
	     date = format.parse(str);
	    } catch (ParseException e) {
	     e.printStackTrace();
	    }
	    return date;
	 }
	 /**
		 * 时间戳转换字符串
		 * @param time
		 * @return d
		 */
	public static String TimeToStr(Long time) {
		SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
		String d = format.format(time);
		return d;
	}

	/**
	 * 字符串转换成时间戳
	 * @param long
	 * @return d
	 */
	public static long  StrToTime(String str) {
		 SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
		    Date date = null;
		    try {
		     date = format.parse(str);
		    } catch (ParseException e) {
		     e.printStackTrace();
		    }
			return date.getTime();
	}
	/**
	 * 获取日期字符串。
	 * 
	 * <pre>
	 *  日期字符串格式：yyyyMMdd
	 *  其中：
	 *      yyyy   表示4位年。
	 *      MM     表示2位月。
	 *      dd     表示2位日。
	 * </pre>
	 * 
	 * @return String "yyyyMMdd"格式的日期字符串。
	 */
	public static String getDate2(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat(date);

		return formatter.format(new Date());
	}
	
	public static void main(String[] args) {  
		System.out.println(GetDate.StrToStr3("16"));
	}
}
