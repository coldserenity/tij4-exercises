package edu.coldserenity.tij.ch02.ex07;

import org.junit.Assert;
import org.junit.Test;

public class CoinFlipperTest {

    @Test
    public void testFlip() throws Exception {
        int headsCount = 0, tailsCount = 0;
        int tmp;

        // flip the coin for 100 times and record results
        // (a little cheat because thus fare we know neither loops
        //  nor conditional statements)
        for (int i = 0; i < 100; i++) {
            tmp = (CoinFlipper.flip() ? headsCount++ : tailsCount++);
        }

        Assert.assertTrue("The algorithm should generate at least 1 head per 100 tosses", headsCount > 0);
        Assert.assertTrue("The algorithm should generate at least 1 tail per 100 tosses", tailsCount > 0);
    }
}
