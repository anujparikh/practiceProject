package src.com.self.utilities;

public class Utils {

    private Utils() {

    }

    public static int[] intArraySwap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }
}