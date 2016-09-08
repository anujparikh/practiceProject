package src.com.self.sort;


import src.com.self.utilities.Utils;

public class BubbleSort {

    public int[] sort(int[] input) {

        for (int i = 0; i < input.length - 2; i++) {
            for (int j = 0; j < input.length - i - 2; j++) {
                if (input[j] > input[j + 1]) {
                    Utils.intArraySwap(input, j, j + 1);
                }
            }
        }

        return input;
    }
}