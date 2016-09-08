package com.self.sort;


import org.junit.Assert;
import org.junit.Test;
import src.com.self.sort.BubbleSort;
import src.com.self.sort.InsertionSort;
import src.com.self.sort.QuickSort;

public class CommonSortTest {

    @Test
    public void inputIntArrayThenBubbleSortTest() {
        int[] inputArray = {3, -4, 5, 7, -9, 2, 17, 13, 24, 45, 43, 54};
        int[] expectedOutputArray = {-9, -4, 2, 3, 5, 7, 13, 17, 24, 43, 45, 54};

        BubbleSort inputBubbleSortObject = new BubbleSort();
        int[] outputArray = inputBubbleSortObject.sort(inputArray);
        Assert.assertNotNull(outputArray);
        Assert.assertArrayEquals(expectedOutputArray, outputArray);
    }

    @Test
    public void inputIntArrayThenQuickSortTest() {
        int[] inputArray = {3, -4, 5, 7, 45, 2, 17, 13, 24, -9, 43, 54};
        int[] expectedOutputArray = {-9, -4, 2, 3, 5, 7, 13, 17, 24, 43, 45, 54};
        QuickSort inputQuickSortObject = new QuickSort(inputArray);
        inputQuickSortObject.sort();
        Assert.assertNotNull(inputArray);
        Assert.assertArrayEquals(expectedOutputArray, inputArray);
    }

    @Test
    public void inputIntArrayThenInsertionSortTest() {
        int[] inputArray = {3, -4, 5, 7, 45, 2, 17, 13, 24, -9, 43, 54};
        int[] expectedOutputArray = {-9, -4, 2, 3, 5, 7, 13, 17, 24, 43, 45, 54};
        InsertionSort inputInsertionSortObject = new InsertionSort(inputArray);
        inputInsertionSortObject.sort();
        Assert.assertNotNull(inputArray);
        Assert.assertArrayEquals(expectedOutputArray, inputArray);
    }

    @Test
    public void inputIntArrayReturnPivotTest() {
        int[] inputArray1 = {1, 2, 3};
        int[] inputArray2 = {10, 4, 2, 5, 3};

        QuickSort inputQuickSortObject1 = new QuickSort(inputArray1);
        QuickSort inputQuickSortObject2 = new QuickSort(inputArray2);
        int result1 = inputQuickSortObject1.selectPivotWithMedianOfThreeMethod(inputArray1[0], inputArray1[inputArray1.length - 1]);
        int result2 = inputQuickSortObject2.selectPivotWithMedianOfThreeMethod(inputArray2[0], inputArray2[inputArray2.length - 1]);
        Assert.assertNotNull(result1);
        Assert.assertNotNull(result2);
        Assert.assertEquals(2, result1);
        Assert.assertEquals(6, result2);
    }
}