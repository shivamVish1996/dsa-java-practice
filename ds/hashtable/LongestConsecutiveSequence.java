package ds.hashtable;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        int count = 0;

        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int element : nums) {
            hashMap.put(element, true);
        }

        for (int element : nums) {
            if (hashMap.containsKey(element - 1)) {
                hashMap.replace(element, false);
            }
        }

        int msp = 0;//max start point
        int ml = 0;//max length
        for (int element : nums) {
            if (hashMap.get(element)) {
                int tl = 1;//temporary length
                while (hashMap.containsKey(element + tl)) {
                    tl++;
                }

                if (tl > ml) {
                    ml = tl;
                    msp = element;
                }
            }
        }
        count = ml;
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2, 5, 6};

        System.out.println(longestConsecutive(nums));

    }
}
