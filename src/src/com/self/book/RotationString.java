package src.com.self.book;

/**
 * Created by anujparikh on 9/30/16.
 */
public class RotationString {

    public static boolean isRotationString1(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        int index = s1.indexOf(s2.charAt(0));
        String subStr = s1.substring(index);

        return isStr1SubStringOfStr2(subStr, s2) && s1.substring(0, index).equals(s2.substring(subStr.length()));
    }

    public static boolean isRotationString2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return isStr1SubStringOfStr2(s2, s1+s1);
    }

    public static boolean isStr1SubStringOfStr2(String s1, String s2) {
        return s2.contains(s1);
    }

    public static void main(String[] args) {
        System.out.println(isRotationString1("waterbottle", "erbottlewat"));
        System.out.println(isRotationString1("asdfghjkl", "fghjklasd"));
        System.out.println(isRotationString1("aaaa", "aaaab"));
        System.out.println(isRotationString1("anujparikhisstudentatwaynestate", "khisstudentatwaynestateanujpari"));
        System.out.println(isRotationString2("waterbottle", "erbottlewat"));
        System.out.println(isRotationString2("asdfghjkl", "fghjklasd"));
        System.out.println(isRotationString2("aaaa", "aaaab"));
        System.out.println(isRotationString2("anujparikhisstudentatwaynestate", "khisstudentatwaynestateanujpari"));
    }
}
