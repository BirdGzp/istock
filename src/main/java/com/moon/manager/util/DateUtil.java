//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.moon.manager.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DateUtil {
    private static final Log log = LogFactory.getLog(DateUtil.class);
    public static final String FORMAT_YYYYMM = "yyyyMM";
    public static final String FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
    public static final String FORMAT_YYYYMMDD = "yyyyMMdd";
    public static final String FORMAT_YYYYMMDDHH = "yyyyMMddHH";
    public static final String FORMAT_YYYYMMDDHHMM = "yyyyMMddHHmm";
    public static final String FORMAT_YYYY_SLASH_MM_SLASH_DD = "yyyy/MM/dd";
    public static final String FORMAT_HHMMSS = "HHmmss";
    public static final String FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_YYYYMMDD_HH_MM_SS = "yyyyMMdd HH:mm:ss";
    public static final String FORMAT_YYYY_SLASH_MM_SLASH_DD_HH_MM_SS = "yyyy/MM/dd HH:mm:ss";
    public static final String FORMAT_YYYY_MM_DD_HH_MM_SS_MS = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String FMT_DATE_YYYYMMDDTHHMMSS_SSSXXX = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    public static final int HOURS_PER_DAY = 24;
    public static final int DAYS_PER_WEEK = 7;
    public static final int DAYS_PER_MONTH = 31;
    public static final int SECONDS_PER_MINUTE = 60;
    public static final int SECONDS_PER_HOUR = 3600;
    public static final int SECONDS_PER_DAY = 86400;
    public static final int MILLI_SECONDS_PER_MINUTE = 60000;
    public static final int MILLI_SECONDS_PER_HOUR = 3600000;
    public static final int MILLI_SECONDS_PER_DAY = 86400000;
    public static final int MONTH_OF_QUARTER = 3;

    public DateUtil() {
    }

    public static Timestamp formatToTimestamp(String dateStr, String format) {
        try {
            SimpleDateFormat sorceFmt = new SimpleDateFormat(format);
            return new Timestamp(sorceFmt.parse(dateStr).getTime());
        } catch (Exception var3) {
            throw new IllegalArgumentException("参数非法:dateStr=" + dateStr + ",format=" + format, var3);
        }
    }

    public static String formatTimestamp(Timestamp time, String format) {
        return time == null ? "" : (new SimpleDateFormat(format)).format(time);
    }

    public static Timestamp getBeginOfToday() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = form.format(cal.getTime()) + " 00:00:00";
        Date date = null;

        try {
            date = form.parse(dateStr);
        } catch (ParseException var5) {
            return null;
        }

        return new Timestamp(date.getTime());
    }

    public static String formatDate(Date date, String format) {
        return date == null ? "" : (new SimpleDateFormat(format)).format(date);
    }

    public static Date formatToDate(String date, String format) {
        try {
            SimpleDateFormat sorceFmt = new SimpleDateFormat(format);
            return new Date(sorceFmt.parse(date).getTime());
        } catch (ParseException var3) {
            throw new IllegalArgumentException("字符串转换异常:date=" + date + ",format=" + format, var3);
        }
    }

    public static String getDateString(Date target) {
        return getDateString(target, "yyyyMMdd");
    }

    public static String getDateString(Date target, String format) {
        return target == null ? "" : (new SimpleDateFormat(format)).format(target);
    }

    public static String getBeforeDayString(String dateStr, int span) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");

        Date date;
        try {
            date = df.parse(dateStr);
        } catch (ParseException var5) {
            date = new Date();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, -span);
        return df.format(calendar.getTime());
    }

    public static boolean checkDateValid(String day, String format) {
        if (StringUtils.isBlank(day)) {
            return false;
        } else {
            if (StringUtils.isBlank(format)) {
                format = "yyyyMMdd";
            }

            if (day.length() != format.length()) {
                return false;
            } else {
                Date date = null;

                try {
                    date = DateUtils.parseDateStrictly(day, new String[]{format});
                } catch (ParseException var4) {
                    log.warn("根据传输的日期与指定格式进行转换，出现了错误");
                }

                return date != null;
            }
        }
    }

    public static Date getYesterday() {
        return addDays((Date)(new Date()), -1);
    }

    public static Date addDays(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, day);
        return calendar.getTime();
    }

    public static Timestamp addDays(Timestamp time, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        calendar.add(5, day);
        return new Timestamp(calendar.getTime().getTime());
    }

    public static Date addHours(Date date, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(11, hours);
        return calendar.getTime();
    }

    public static Timestamp addHours(Timestamp time, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        calendar.add(11, hours);
        return new Timestamp(calendar.getTime().getTime());
    }

    public static Date addMonths(Date date, int month) {
        return DateUtils.addMonths(date, month);
    }

    public static Timestamp addTimeByOffset(Timestamp start, int field, int offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        calendar.add(field, offset);
        return new Timestamp(calendar.getTime().getTime());
    }

    public static int getDaysBetween(Date start, Date end) {
        Date beginOfStart = DateUtils.truncate(start, 5);
        Date beginOfEnd = DateUtils.truncate(end, 5);
        return (int)((beginOfEnd.getTime() - beginOfStart.getTime()) / 86400000L);
    }

    public static Date getStartOfDay(Date date) {
        return DateUtils.truncate(date, 5);
    }

    public static Date getEndOfDay(Date date) {
        return DateUtils.addMilliseconds(DateUtils.ceiling(date, 5), -1);
    }

    public static Timestamp getNow() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static List<Date> getDaysBetweenDates(Date startdate, Date enddate) {
        List<Date> dates = new ArrayList();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(startdate);

        while(calendar.getTime().before(enddate)) {
            Date result = calendar.getTime();
            dates.add(result);
            calendar.add(5, 1);
        }

        dates.add(enddate);
        return dates;
    }

    public static Date getEndOfTheMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(5, 1);
        cal.add(2, 1);
        cal.add(5, -1);
        return getStartOfDay(cal.getTime());
    }

    public static Date getBeginOfTheMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(5, 1);
        return getStartOfDay(cal.getTime());
    }

    public static Date getEndOfTheWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(2);
        cal.setTime(date);
        cal.set(cal.get(1), cal.get(2), cal.get(5), 0, 0, 0);
        cal.set(7, 1);
        return getStartOfDay(cal.getTime());
    }

    public static Date getBeginOfTheWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(2);
        cal.setTime(date);
        cal.set(cal.get(1), cal.get(2), cal.get(5), 0, 0, 0);
        cal.set(7, 2);
        return getStartOfDay(cal.getTime());
    }

    public static Date getBeginOfTheQuarter(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(2) / 3 * 3;
        cal.set(2, month);
        cal.set(5, 1);
        return getStartOfDay(cal.getTime());
    }

    public static Date getEndOfTheQuarter(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(2) / 3 * 3 + 2;
        cal.set(2, month);
        cal.set(5, cal.getActualMaximum(5));
        return getStartOfDay(cal.getTime());
    }

    public static boolean isSameDay(Date date1, Date date2) {
        if (date1 != null && date2 != null) {
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(date1);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(date2);
            return isSameDay(cal1, cal2);
        } else {
            return false;
        }
    }

    public static boolean isSameDay(Calendar cal1, Calendar cal2) {
        if (cal1 != null && cal2 != null) {
            return cal1.get(0) == cal2.get(0) && cal1.get(1) == cal2.get(1) && cal1.get(6) == cal2.get(6);
        } else {
            return false;
        }
    }

    public static boolean compareStartAndEndTime(Timestamp startTime, Timestamp endTime) {
        if (startTime != null && endTime != null) {
            return endTime.getTime() - startTime.getTime() > 0L;
        } else {
            return false;
        }
    }

    public static boolean compareStartAndEndTime(Date startTime, Date endTime) {
        if (startTime != null && endTime != null) {
            return endTime.getTime() - startTime.getTime() > 0L;
        } else {
            return false;
        }
    }

    public static boolean isGreaterThanNow(Date time) {
        if (time != null) {
            return time.getTime() - getNow().getTime() > 0L;
        } else {
            return false;
        }
    }

    public static boolean isGreaterThanNow(Timestamp time) {
        if (time != null) {
            return time.getTime() - getNow().getTime() > 0L;
        } else {
            return false;
        }
    }

    public static Timestamp convertDateToTimeStamp(Date date) {
        return date != null ? new Timestamp(date.getTime()) : null;
    }
}
