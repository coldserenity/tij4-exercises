package edu.coldserenity.tij.ch02.ex06;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class IfElse2Test {

    @DataProvider
    public static Object[][] testData() {
        return new Object[][]{
                // match
                {5, 0, 10, 0},

                // match/nomatch on the lower edge
                {0, 0, 10, 0},
                {-1, 0, 10, -1},

                // match/nomatch on the upper edge
                {10, 0, 10, 0},
                {11, 0, 10, 1},
        };
    }

    @Test
    @UseDataProvider("testData")
    public void testTest1(int val, int begin, int end, int expected) throws Exception {
        assertEquals(expected, IfElse2.test(val, begin, end));
    }
}
