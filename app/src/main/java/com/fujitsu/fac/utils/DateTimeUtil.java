package com.fujitsu.fac.utils;

import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * Created by b.balote on 8/9/2017.
 */

public class DateTimeUtil {

    private static final String DATE_FORMAT = "MMM dd, yyyy";
    private static final String TIME_FORMAT = "hh:mm aa";

    private DateTimeUtil() {
    }

    public static String convertDateToString(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        return format.format(date);
    }

    public static String convertTimeToString(Date time) {
        SimpleDateFormat format = new SimpleDateFormat(TIME_FORMAT);
        return format.format(time);
    }
}
