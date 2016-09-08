package src.com.self.sort;

import src.com.self.utilities.Utils;

public class QuickSort {

    private int[] inputArray;

    public QuickSort(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public void sort() {
        applyQuickSortAlgorithm(0, inputArray.length - 1);
    }

    private void applyQuickSortAlgorithm(int lowIndex, int highIndex) {
        int i = lowIndex;
        int j = highIndex;
        int pivot = selectPivotWithMedianOfThreeMethod(inputArray[lowIndex], inputArray[highIndex]);
        while (i <= j) {
            while (inputArray[i] < pivot) {
                i++;
            }
            while (inputArray[j] > pivot) {
                j--;
            }
            if (i <= j) {
                Utils.intArraySwap(inputArray, i, j);
                i++;
                j--;
            }
        }

        if (lowIndex < j) {
            applyQuickSortAlgorithm(lowIndex, j);
        }
        if (highIndex > i) {
            applyQuickSortAlgorithm(i, highIndex);
        }
    }

    public int selectPivotWithMedianOfThreeMethod(int a, int b) {
        return ((a + b + ((a + b) / 2)) / 3);
    }
}