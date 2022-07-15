package leetcode.general;

/**
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * Example 2:
 * <p>
 * Input: n = 2
 * Output: false
 */
public class HappyNumber {

    public static boolean isHappy(int n) {
        if (n == 1 || n == 10)
            return true;

        return findSum(n);
    }

    private static boolean findSum(int n) {


        int num = n, rem, sum = 0;
        try {
            while (num > 0) {
                rem = num % 10;
                sum = sum + rem * rem;
                num = num / 10;
            }
            if (sum == 1 || sum == 10)
                return true;
            else return findSum(sum);
        } catch (StackOverflowError s) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
