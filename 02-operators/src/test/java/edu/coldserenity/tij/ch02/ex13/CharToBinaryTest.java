package edu.coldserenity.tij.ch02.ex13;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class CharToBinaryTest {

    @DataProvider
    public static Object[][] charsConversionTestData() {
        return new Object[][]{
                {'a', "1100001"},
                {'b', "1100010"},
                {'c', "1100011"}
        };
    }

    @Test
    @UseDataProvider("charsConversionTestData")
    public void testConvert(char charToConvert, String expectedBinaryStringRepresentation) throws Exception {
        Assert.assertEquals(expectedBinaryStringRepresentation, CharToBinary.convert(charToConvert));
    }
}
