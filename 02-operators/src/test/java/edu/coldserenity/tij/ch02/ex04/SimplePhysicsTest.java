package edu.coldserenity.tij.ch02.ex04;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class SimplePhysicsTest {

    private static final double DELTA = 1e-15;

    @DataProvider
    public static Object[][] velocityTestDataSet() {
        return new Double[][]{
                {100.0, 20.0, 5.0},
                {0.0, 0.0, 0.0},
                {-100.0, 0.0, Double.NEGATIVE_INFINITY},
        };
    }

    /**
     * Tests velocity calculation method.
     *
     * @param s input space
     * @param t input time
     * @param v expected velocity
     * @throws Exception if it happens
     */
    @Test
    @UseDataProvider("velocityTestDataSet")
    public void testV(double s, double t, double v) throws Exception {
        Assert.assertEquals(v, SimplePhysics.v(s, t), DELTA);
    }
}
