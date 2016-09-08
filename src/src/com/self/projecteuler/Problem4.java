package src.com.self.projecteuler;

public class Problem4 {

    public static Boolean isPalindrome(Integer input) {
        char[] inputStrArray = input.toString().toCharArray();
        int strLength = inputStrArray.length;
        for (int i = 0; i <= strLength / 2; i++) {
            if (inputStrArray[i] != inputStrArray[strLength - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Integer highest = 0;

        for (int startNo = 999; startNo > 99; startNo--) {
            for (int multiplier = 999; multiplier > 99; multiplier--) {
                int number = startNo * multiplier;
                if (isPalindrome(number)) {
                    if (number > highest) highest = number;
                }
            }
        }

        System.out.println("Highest Palindrome number is: " + highest);
    }
}
