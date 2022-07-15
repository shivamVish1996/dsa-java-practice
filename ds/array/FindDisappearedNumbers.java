package ds.array;

import java.util.*;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        for (int i = 1; i <= nums.length; i++)
            if (!set.contains(i))
                list.add(i);

        return list;
    }

    public static void main(String[] args) {
      //  int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums = {1, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
