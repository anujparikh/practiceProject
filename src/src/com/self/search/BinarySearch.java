package src.com.self.search;

public class BinarySearch {

    public int search(int [] array, int searchNumber) {
        int lowIndex = 0;
        int highIndex = array.length - 1;
        int midIndex;
        int searchIndex = -1;

        while (lowIndex <= highIndex) {
            midIndex = (lowIndex + highIndex) / 2;
            if (searchNumber == array[midIndex]) {
                searchIndex = midIndex;
                lowIndex = midIndex + 1;
                highIndex = midIndex - 1;
            } else if (searchNumber > array[midIndex]) {
                lowIndex = midIndex + 1;
            } else {
                highIndex = midIndex - 1;
            }
        }

        return searchIndex;
    }
}