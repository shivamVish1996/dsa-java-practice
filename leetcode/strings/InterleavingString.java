package leetcode.strings;

/**
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 * <p>
 * An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:
 * <p>
 * s = s1 + s2 + ... + sn
 * t = t1 + t2 + ... + tm
 * |n - m| <= 1
 * The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
 * Note: a + b is the concatenation of strings a and b.
 * <p>
 * Example 1:
 * <p>
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * Output: true
 * <p>
 * Example 2:
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * Output: false
 * <p>
 * Example 3:
 * Input: s1 = "", s2 = "", s3 = ""
 * Output: true
 */
public class InterleavingString {

    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        //  String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
        // String s1 = "", s2 = "", s3 = "a";
        //  String s1 = "", s2 = "b", s3 = "b";
        //  String s1 = "a", s2 = "b", s3 = "aa";
        System.out.println(interleavingString(s1, s2, s3));
    }

    private static boolean interleavingString(String s1, String s2, String s3) {

        if (s1.isEmpty() && s2.isEmpty() && s3.isEmpty())
            return true;

        int j = 0, k = 0;
        for (int i = 0; i < s3.length(); i++) {
            try {
                char ch = s3.charAt(i);
                if (!s1.isEmpty() && ch == s1.charAt(j))
                    j++;
                else if (!s2.isEmpty() && ch == s2.charAt(k))
                    k++;
                else
                    return false;
            } catch (StringIndexOutOfBoundsException e) {
                return false;
            }
        }
        return true;
    }
}
