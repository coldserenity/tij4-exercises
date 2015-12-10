package edu.coldserenity.tij.ch02.ex09;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

@RunWith(DataProviderRunner.class)
public class FibonacciTest {

    @DataProvider
    public static Object[][] testDataSet() {
        return new Object[][]{
                {0, new Integer[]{}},
                {1, new Integer[]{1}},
                {5, new Integer[]{1, 1, 2, 3, 5}},
                {9, new Integer[]{1, 1, 2, 3, 5, 8, 13, 21, 34}},
        };
    }

    @Test
    @UseDataProvider("testDataSet")
    public void testGetNumbers(int count, Integer[] expected) throws Exception {
        assertArrayEquals(expected, Fibonacci.getNumbers(count).toArray());
    }
}
