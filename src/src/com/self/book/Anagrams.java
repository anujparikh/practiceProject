package src.com.self.book;

/**
 * Created by anujparikh on 9/30/16.
 */
public class Anagrams {

    public static boolean areAragrams(String s1, String s2) {

        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        if (s1.length() != s2.length()) return false;

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        for (int i = 0; i < sb1.length(); i++) {
            if (sb2.indexOf(String.valueOf(sb1.charAt(i))) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAragrams("abcd", "dcab"));
        System.out.println(areAragrams("abcd", "abcdcd"));
        System.out.println(areAragrams("Clint Eastwood!", "Old! West action"));
    }
}
