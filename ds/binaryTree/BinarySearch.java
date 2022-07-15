package ds.binaryTree;

public class BinarySearch {

    public static int binarySearch(int[] nums, int first, int last, int target) {
        if (last >= first) {
            int mid = (first + last) / 2;

            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                return binarySearch(nums, mid + 1, last, target);
            else
                return binarySearch(nums, first, mid - 1, target);
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
          int target = 9;
       // int[] nums = {-1, 0, 3, 5, 9, 12};
      //  int target = 12;

        System.out.println(search(nums, target));
    //    System.out.println(binarySearch(nums, 0, nums.length - 1, target));
    }
}
