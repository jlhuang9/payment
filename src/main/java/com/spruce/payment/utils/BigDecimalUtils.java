package com.spruce.payment.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtils {

    public static double round(double d, int scla) {
        BigDecimal bigDecimal = new BigDecimal(d);
        BigDecimal scale = bigDecimal.setScale(scla, RoundingMode.HALF_UP);
        return scale.doubleValue();
    }

    public static double min(double a, double b) {
        return a < b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }


    public static double min(int a, int b) {
        return a < b ? a : b;
    }

    public static double max(int a, int b) {
        return a > b ? a : b;
    }
}
