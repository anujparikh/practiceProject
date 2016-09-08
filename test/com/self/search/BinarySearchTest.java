package com.self.search;

import org.junit.Assert;
import org.junit.Test;
import src.com.self.search.BinarySearch;

public class BinarySearchTest {

    @Test
    public void searchNumberSuccessTest() {
        int [] inputArray = {-2, 1, 3, 5, 10, 14, 15, 23, 34, 54, 67, 87, 98};
        int searchNumber = 15;

        BinarySearch inputBinarySearchObject = new BinarySearch();
        int searchedIndex = inputBinarySearchObject.search(inputArray, searchNumber);

        Assert.assertNotNull(searchedIndex);
        Assert.assertEquals(6, searchedIndex);
    }

    @Test
    public void searchNumberNegativeTest() {
        int [] inputArray = {-2, 1, 3, 5, 10, 14, 15, 23, 34, 54, 67, 87, 98};
        int searchNumber = 32;

        BinarySearch inputBinarySearchObject = new BinarySearch();
        int searchedIndex = inputBinarySearchObject.search(inputArray, searchNumber);

        Assert.assertNotNull(searchedIndex);
        Assert.assertEquals(-1, searchedIndex);
    }

    @Test
    public void searchNumberAtMidIndexTest() {
        int [] inputArray = {-2, 1, 3, 5, 10, 14, 15, 23, 34, 54, 67, 87, 98, 100};
        int searchNumber = 15;

        BinarySearch inputBinarySearchObject = new BinarySearch();
        int searchedIndex = inputBinarySearchObject.search(inputArray, searchNumber);

        Assert.assertNotNull(searchedIndex);
        Assert.assertEquals(6, searchedIndex);
    }
}