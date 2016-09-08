package com.self.projecteuler;

import org.junit.Assert;
import org.junit.Test;
import src.com.self.projecteuler.Problem4;

public class Problem4Test {

    @Test
    public void isPalindromeSuccessTest() {
        Problem4 input = new Problem4();
        Assert.assertTrue(input.isPalindrome(12321));
        Assert.assertFalse(input.isPalindrome(12342321));
    }
}
