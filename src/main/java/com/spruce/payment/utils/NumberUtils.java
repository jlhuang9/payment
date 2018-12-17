package com.spruce.payment.utils;

public class NumberUtils {

    public static double DOUBLE_ZERO = 0.0;
    public static int INTEGER_ZERO = 0;

    public static <T> T getValue(Result<T> result, String value) {
        return result.parse(value);
    }

    public static <T> T getValueIfError(Result<T> result, String value, T defult) {
        try {
            return result.parse(value);
        } catch (Exception e) {
            return defult;
        }
    }

    public static double getDoubleIfErrorZero(String value) {
        return getDoubleIfError(value, DOUBLE_ZERO);
    }

    public static double getDoubleIfError(String value, double defult) {
        return getValueIfError(Double::parseDouble, value, defult);
    }

    public static int getIntIfErrorZero(String value) {
        return getIntIfError(value, INTEGER_ZERO);
    }

    public static int getIntIfError(String value, int defult) {
        return getValueIfError(Integer::parseInt, value, defult);
    }

    interface Result<T>{
        T parse(String value);
    }
}
