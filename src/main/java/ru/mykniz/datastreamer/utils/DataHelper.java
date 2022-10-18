package ru.mykniz.datastreamer.utils;

import java.math.BigDecimal;
import java.util.Random;

public class DataHelper {

    public static String getRandomCode() {
        return String.valueOf(new Random()
                .ints(400000, 400999)
                .findAny()
                .getAsInt());
    }

    public static BigDecimal getRandomPrice() {
        return BigDecimal.valueOf(new Random()
                .ints(100, 999)
                .findAny()
                .getAsInt());
    }
}
