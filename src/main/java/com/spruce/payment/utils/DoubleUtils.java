package com.spruce.payment.utils;

public class DoubleUtils {

    public static double ZERO = 0.0;

    public static double getDoubleIfErrorZero(String s) {
        return getDoubleIfError(s, ZERO);
    }

    public static double getDoubleIfError(String s, double def) {
        try {
            System.out.println(s);
            return Double.parseDouble(s);
        } catch (Exception e) {
            e.printStackTrace();
            return def;
        }
    }
}
