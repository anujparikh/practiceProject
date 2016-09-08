package src.com.self.sort;


import src.com.self.utilities.Utils;

public class InsertionSort {

    private int[] input;

    public InsertionSort(int [] input) {
        this.input = input;
    }

    public int[] sort() {

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input [j - 1]) {
                    Utils.intArraySwap(input, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return input;
    }
}
