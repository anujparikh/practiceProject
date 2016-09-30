package src.com.self.book;

/**
 * Created by anujparikh on 9/30/16.
 */
public class RemoveDuplicateChar {
    public static void removeDuplicateCharFromString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(j);
                    j--;
                }
            }
        }

        System.out.println("Modified String: " + stringBuilder);
    }

    public static void main(String[] args) {
        removeDuplicateCharFromString("abcd");
        removeDuplicateCharFromString("aaaa");
        removeDuplicateCharFromString("");
        removeDuplicateCharFromString("aaabbb");
        removeDuplicateCharFromString("anujparikh");
        removeDuplicateCharFromString("aabcddefgab");
    }
}
