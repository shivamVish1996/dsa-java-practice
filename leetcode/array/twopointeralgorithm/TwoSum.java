package leetcode.array.twopointeralgorithm;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);

        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (target == nums[i] + nums[j])
                return new int[]{i, j};
            else if (target > nums[i] + nums[j])
                i++;
            else
                j--;
        }
        return null;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
