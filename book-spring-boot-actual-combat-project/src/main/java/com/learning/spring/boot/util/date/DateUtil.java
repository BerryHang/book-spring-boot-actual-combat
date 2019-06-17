package com.learning.spring.boot.util.date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.jsoup.helper.StringUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @Package: com.learning.spring.boot.util.date
 * @ClassName: DateUtil
 * @Author: beibei.huang
 * @Description: 日期处理类
 * @Date: 2019/6/17 9:45
 */
public class DateUtil extends DateUtils {

    /** yyyyMMdd */
    public static final String SHORT_FORMAT = "yyyyMMdd";

    /** yyyyMMddHHmmss */
    public static final String LONG_FORMAT = "yyyyMMddHHmmss";

    /** yyyy-MM-dd */
    public static final String WEB_FORMAT = "yyyy-MM-dd";

    /** HHmmss */
    public static final String TIME_FORMAT = "HHmmss";

    /** yyyyMM */
    public static final String MONTH_FORMAT = "yyyyMM";

    /** yyyy年MM月dd日 */
    public static final String CHINA_FORMAT = "yyyy年MM月dd日";

    /** yyyy-MM-dd HH:mm:ss */
    public static final String LONG_WEB_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /** yyyy-MM-dd HH:mm */
    public static final String LONG_WEB_FORMAT_NO_SEC = "yyyy-MM-dd HH:mm";

    /**
     * 日期加减天数
     *
     * @param start
     *            起始日期
     * @param day
     *            加减的天数 -7 起始日期加7天 则反
     * @return
     */
    public static Date minusDay(Date start, int day) {
        DateTime newDate = new DateTime(start).minusMinutes(day);
        return newDate.toDate();
    }

    /**
     * 日期增加分钟数
     *
     * @param start
     *            开始时间
     * @param minutes
     *            分钟数
     * @return
     */
    public static Date minusMinutes(Date start, int minutes) {
        DateTime newDate = new DateTime(start).minusMinutes(minutes);
        return newDate.toDate();
    }

    /**
     * 日期增加秒数
     *
     * @param seconds
     * @return
     */
    public static Date minusSeconds(int seconds) {
        DateTime newDate = new DateTime(new Date()).minusSeconds(seconds);
        return newDate.toDate();
    }

    /**
     * 日期对象解析成日期字符串基础方法，可以据此封装出多种便捷的方法直接使用
     *
     * @param date
     *            待格式化的日期对象
     * @param format
     *            输出的格式
     * @return 格式化的字符串
     */
    public static String format(Date date, String format) {
        if (date == null || StringUtils.isBlank(format)) {
            return StringUtils.EMPTY;
        }
        return new DateTime(date).toString(format, Locale.SIMPLIFIED_CHINESE);
    }

    public static Date getYesterday() {
        return DateTime.now().minusDays(1).toDate();
    }

    /**
     * 格式化当前时间
     *
     * @param format
     *            输出的格式
     * @return
     */
    public static String formatCurrent(String format) {
        if (StringUtils.isBlank(format)) {
            return StringUtils.EMPTY;
        }
        return new DateTime().toString(format, Locale.SIMPLIFIED_CHINESE);
    }

    /**
     * 日期字符串解析成日期对象基础方法，可以在此封装出多种便捷的方法直接使用
     *
     * @param dateStr
     *            日期字符串
     * @param format
     *            输入的格式
     * @return 日期对象
     * @throws ParseException
     */
    public static Date parse(String dateStr, String format) {
        return DateTimeFormat.forPattern(format).withLocale(Locale.SIMPLIFIED_CHINESE).parseDateTime(dateStr).toDate();
    }

    /**
     * 日期字符串解析成日期对象基础方法，可以在此封装出多种便捷的方法直接使用
     *
     * @param dateStr
     *            日期字符串
     * @param format
     *            输入的格式
     * @return 日期对象
     * @throws ParseException
     */
    public static Date parseLongFormat(String dateStr) {
        int formatLength = StringUtils.length(DateUtil.LONG_FORMAT);
        dateStr = StringUtils.rightPad(dateStr, formatLength, "0");
        return parse(dateStr, LONG_FORMAT);
    }

    /**
     * 日期字符串解析成日期对象基础方法，可以在此封装出多种便捷的方法直接使用
     *
     * @param dateStr
     *            日期字符串 (yyyy-MM-dd HH:mm:ss)
     * @return 日期对象
     * @throws ParseException
     */
    public static Date parseLongWebFormat(String dateStr) {

        return parse(dateStr, LONG_WEB_FORMAT);
    }

    /**
     * 日期字符串格式化基础方法，可以在此封装出多种便捷的方法直接使用
     *
     * @param dateStr
     *            日期字符串
     * @param formatIn
     *            输入的日期字符串的格式
     * @param formatOut
     *            输出日期字符串的格式
     * @return 已经格式化的字符串
     * @throws ParseException
     */
    public static String format(String dateStr, String formatIn, String formatOut) {
        Date date = parse(dateStr, formatIn);
        return format(date, formatOut);
    }

    /**
     * 把日期对象按照<code>yyyyMMdd</code>格式解析成字符串
     *
     * @param date
     *            待格式化的日期对象
     * @return 格式化的字符串
     */
    public static String formatShort(Date date) {
        return format(date, SHORT_FORMAT);
    }

    /**
     * 把日期字符串按照<code>yyyyMMdd</code>格式，进行格式化
     *
     * @param dateStr
     *            待格式化的日期字符串
     * @param formatIn
     *            输入的日期字符串的格式
     * @return 格式化的字符串
     */
    public static String formatShort(String dateStr, String formatIn) {
        return format(dateStr, formatIn, SHORT_FORMAT);
    }

    /**
     * 把日期对象按照<code>yyyy-MM-dd</code>格式解析成字符串
     *
     * @param date
     *            待格式化的日期对象
     * @return 格式化的字符串
     */
    public static String formatWeb(Date date) {
        return format(date, WEB_FORMAT);
    }

    /**
     * 把日期字符串按照<code>yyyy-MM-dd</code>格式，进行格式化
     *
     * @param dateStr
     *            待格式化的日期字符串
     * @param formatIn
     *            输入的日期字符串的格式
     * @return 格式化的字符串
     * @throws ParseException
     */
    public static String formatWeb(String dateStr, String formatIn) {
        return format(dateStr, formatIn, WEB_FORMAT);
    }

    /**
     * 把日期对象按照<code>yyyyMM</code>格式解析成字符串
     *
     * @param date
     *            待格式化的日期对象
     * @return 格式化的字符串
     */
    public static String formatMonth(Date date) {

        return format(date, MONTH_FORMAT);
    }

    /**
     * 把日期对象按照<code>HHmmss</code>格式解析成字符串
     *
     * @param date
     *            待格式化的日期对象
     * @return 格式化的字符串
     */
    public static String formatTime(Date date) {
        return format(date, TIME_FORMAT);
    }

    /**
     * 获取yyyyMMddHHmmss+n位随机数格式的时间戳
     *
     * @param n
     *            随机数位数
     * @return
     */
    public static String getTimestamp() {
        return formatCurrent(LONG_FORMAT);
    }

    /**
     * 根据日期格式返回昨日日期
     *
     * @param format
     * @return
     */
    public static String getYesterdayDate(String format) {
        return format(DateTime.now().minusDays(1).toDate(), format);
    }

    /**
     * 验证系统当前时间，是否在starDate与endDate之间(时间必须是毫秒级别的)
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static boolean isBetweenStarAndEndDate(Date startDate, Date endDate) {
        return isBetweenStarAndEndDate(startDate, endDate, Calendar.MILLISECOND);
    }

    /**
     * 验证系统当前时间，是否在starDate与endDate之间
     *
     * @param startDate
     * @param endDate
     * @param field
     *            =[Calendar.MILLISECOND 毫秒级别] =[Calendar.DAY 比较到天]
     *            =[Calendar.YEAR 比较到年]
     * @return
     */
    public static boolean isBetweenStarAndEndDate(Date startDate, Date endDate, int field) {
        // 系统当前时间
        Date date = truncate(new Date(), field);

        return isBetweenStarAndEndDate(date, startDate, endDate);
    }

    /**
     * 验证date是否在starDate与endDate之间
     * <p>
     * <li>true:date[20140603],startDate[20140601],endDate[20140606]</li>
     * <li>false:date[20140607],startDate[20140601],endDate[20140606]</li>
     * <li>false:date[20140531],startDate[20140601],endDate[20140606]</li>
     * </p>
     *
     * @param date
     * @param startDate
     * @param endDate
     * @return
     */
    public static boolean isBetweenStarAndEndDate(Date date, Date startDate, Date endDate) {
        return !(date.getTime() < startDate.getTime() || date.getTime() > endDate.getTime());
    }

    /**
     * <p>
     * 获取日期
     * <li>1.例如:2014-09-18 16:15:18 = 18</li>
     * <li>2.例如:2014-09-11 16:18:18 = 11</li>
     * </p>
     *
     * @param date
     * @return
     */
    public static String getDate(Date date) {

        return format(date, "dd");
    }

    /**
     * 格式化字符串，将yyyy-mm-dd hh:mm:ss 变为 yyyy-mm-dd hh:mm
     *
     * @param dateStr
     * @return
     */
    public static String format(String dateStr) {
        if (StringUtil.isBlank(dateStr)) {
            return StringUtils.EMPTY;
        }
        String resultStr = format(dateStr, DateUtil.LONG_WEB_FORMAT, DateUtil.LONG_WEB_FORMAT_NO_SEC);
        resultStr = StringUtils.replace(StringUtils.trim(resultStr), " ", "<br/>");
        return resultStr;
    }

    /**
     * 格式化字符串，yyyy-mm-dd hh:mm:ss
     *
     * @param dateStr
     * @return
     */
    public static String formatLongWeb(Date date) {
        return format(date, LONG_WEB_FORMAT);
    }

}
