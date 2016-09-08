package src.com.self.search;

public class LinearSearch {

    public int searchIndex(int[] array, int searchNumber) {
        int index = 0;
        for (int number : array) {
            if (searchNumber == number) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }
}