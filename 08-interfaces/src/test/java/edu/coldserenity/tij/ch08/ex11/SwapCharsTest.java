package edu.coldserenity.tij.ch08.ex11;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Testing swap of chars.
 */
@RunWith(DataProviderRunner.class)
public class SwapCharsTest {

    @DataProvider
    public static Object[][] swapCharsTestDataSet() {
        return new String[][]{
                {"Hello!", "eHll!o"},
                {"Odd number of chars", "dO dunbmreo  fhcras"},
                {"", ""},
                {null, null}
        };
    }

    @Test
    @UseDataProvider("swapCharsTestDataSet")
    public void testDoSwap(String input, String expected) throws Exception {
        assertEquals(expected, new SwapChars().doSwap(input));
    }
}