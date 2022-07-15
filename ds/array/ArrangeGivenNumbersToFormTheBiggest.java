package ds.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Given two numbers X and Y, how should myCompare() decide which number to put first – we compare two numbers XY
 * (Y appended at the end of X) and YX (X appended at the end of Y). If XY is larger, then X should come before Y
 * in output, else Y should come before. For example, let X and Y be 542 and 60. To compare X and Y, we compare 54260
 * and 60542. Since 60542 is greater than 54260, we put Y first.
 */
public class ArrangeGivenNumbersToFormTheBiggest {

    public static void main(String[] args) {

        String s = "000000";
        int i = Integer.parseInt(s);
        System.out.println(i);


        List<String> arr = new ArrayList<>();

        // output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);
    }

    private static void printLargest(List<String> arr) {
        StringBuffer largestNumber = new StringBuffer();

        arr.sort(new MyComparator());
        arr.forEach(System.out::print);
        System.out.println();

        Comparator<String> comparator = (n1, n2) -> {
            String n1n2 = n1 + n2;
            String n2n1 = n2 + n1;
            return n1n2.compareTo(n2n1) > 0 ? -1 : 1;
        };

        arr.stream().sorted(comparator).forEach(System.out::print);
        System.out.println(arr);

        System.out.println();
        arr.forEach(largestNumber::append);
        System.out.println(largestNumber);
    }
}

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String n1, String n2) {
        String n1n2 = n1 + n2;
        String n2n1 = n2 + n1;
        return n1n2.compareTo(n2n1) > 0 ? -1 : 1;
    }
}

//leetcode
class Solution {
    public String largestNumber(int[] nums) {

        List<String> list = new ArrayList<>();

        for (int element : nums)
            list.add(String.valueOf(element));

        return getMaxNumber(list);
    }

    public String getMaxNumber(List<String> list) {
        StringBuffer largestNumber = new StringBuffer();

        Comparator<String> comparator = (n1, n2) -> {
            String n1n2 = n1 + n2;
            String n2n1 = n2 + n1;
            return n1n2.compareTo(n2n1) > 0 ? -1 : 1;
        };

        list.sort(comparator);

        if (list.get(0).equals("0")) {
            return "0";
        }

        list.forEach(largestNumber::append);

        return largestNumber.toString();
    }

}