package src.com.self.book;

/**
 * Created by anujparikh on 9/30/16.
 */
public class ReverseCStyleString {

    /**
     * time complexity: O(n)
     * space complexity: O(n)
     *
     * @param s
     */
    public static void reverseStringCStyle(String s) {
        s = s + "\n";
        StringBuilder myString = new StringBuilder(s);
        char temp;
        for (int i = 0, j = myString.length() - 1; i < myString.length() / 2; i++, j--) {
            temp = myString.charAt(i);
            myString.setCharAt(i, myString.charAt(j));
            myString.setCharAt(j, temp);
        }
        System.out.println("Modified String: " + myString);
    }

    public static void main(String[] args) {
        reverseStringCStyle("abcd");
    }
}
