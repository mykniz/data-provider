package ru.mykniz.datastreamer.utils;

import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.assertNotNull;

public class DataHelperTest {

    @Test
    public void getRandomCode() {
        String randomCode = DataHelper.getRandomCode();
        assertNotNull(randomCode);
    }

    @Test
    public void getRandomPrice() {
        BigDecimal randomPrice = DataHelper.getRandomPrice();
        assertNotNull(randomPrice);

    }
}
