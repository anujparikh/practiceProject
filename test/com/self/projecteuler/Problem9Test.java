package com.self.projecteuler;

import org.junit.Assert;
import org.junit.Test;
import src.com.self.projecteuler.Problem9;

public class Problem9Test {

    @Test
    public void pythagoreanTripletTest() {
        Problem9 testObject = new Problem9();
        Assert.assertEquals((long) 31875000, (long) testObject.pythagoreanTriplet(1000));
    }
}
