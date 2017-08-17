package com.fujitsu.fac.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by b.balote on 8/4/2017.
 */

public class RegexUtil {

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String PHONE_PATTERN = "^(\\d{7}|\\d{9})$";
    private static final String MOBILE_PATTERN = "^(09|\\+639)\\d{9}$";

    private RegexUtil() {
    }

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String temp = phoneNumber.replace("-", "").replace(" ", "").replace("(", "").replace(")", "");
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(temp);
        return matcher.matches();
    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        String temp = mobileNumber.replace("-", "").replace(" ", "").replace("(", "").replace(")", "");
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        Matcher matcher = pattern.matcher(temp);
        return matcher.matches();
    }
}
