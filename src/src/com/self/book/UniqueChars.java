package src.com.self.book;

/**
 * Created by anujparikh on 9/30/16.
 */
public class UniqueChars {

    /**
     * time complexity: O(n)
     * space complexity: O(n)
     *
     * @param s
     * @return
     */
    public static boolean isUniqueChars(String s) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChars("anujparikh"));
        System.out.println(isUniqueChars("anuj"));
    }
}
