package edu.coldserenity.tij.ch02.ex10;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.*;

@RunWith(DataProviderRunner.class)
public class VampireNumberTest {

    @DataProvider
    public static Object[][] datasetForTestDigitCount() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {10, 2},
                {99, 2},
                {100, 3},
                {999, 3},
                {1000, 4},
                {9999, 4}

        };
    }

    @DataProvider
    public static Object[][] datasetForTestSplitNumber() {
        return new Object[][]{
                {0, new int[]{0}},
                {1, new int[]{1}},
                {10, new int[]{1, 0}},
                {101, new int[]{1, 0, 1}},
                {1000, new int[]{1, 0, 0, 0,}},
                {9999, new int[]{9, 9, 9, 9}}
        };
    }

    @Test
    public void testGet4Digit() throws Exception {
        Map fourDigitVampNumsMap = VampireNumber.find4Digit();
        Set fourDigitVampNums = fourDigitVampNumsMap.keySet();


        assertThat(fourDigitVampNums, (Matcher) hasItem(1260));
        assertTrue(fourDigitVampNums.contains(1827));
        assertTrue(fourDigitVampNums.contains(2187));
    }

    @Test
    @UseDataProvider("datasetForTestSplitNumber")
    public void testSplitNumber(int number, int[] expectedDigits) {
        assertArrayEquals(expectedDigits, VampireNumber.splitNumber(number));
    }

    @Test
    @UseDataProvider("datasetForTestDigitCount")
    public void testDigitCount(int number, int expectedDigitCount) {
        assertEquals(String.format("Digit count doest not match for number %d", number),
                expectedDigitCount, VampireNumber.getDigitCount(number));
    }
}
