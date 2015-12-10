package edu.coldserenity.tij.ch02.ex05;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(DataProviderRunner.class)
public class BitwiseMixTest {

    @DataProvider
    public static Object[][] testDecimals () {
        return new Object[][] {
                {1},
                {-1},
                {Long.MAX_VALUE},
                {Long.MIN_VALUE},
                {0},
                {34095},
                {-34095}
        };
    }

    @Test
    @UseDataProvider("testDecimals")
    public void testToBinaryString(long valueToTest) throws Exception {
        assertEquals(Long.toBinaryString(valueToTest), BitwiseMix.toBinaryString(valueToTest));
    }
}
