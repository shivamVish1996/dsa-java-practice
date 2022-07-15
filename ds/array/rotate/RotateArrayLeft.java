package ds.array.rotate;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(Arrays.toString(a));

        //appraoch 1, copy first k element and add in new temp array
        //shift the elements in original array
        //add the elements from temp array in the original array

        //approach 2: run loop for k times
        //hold first element in variable(last) and shift each element to left
        //at last, add last in a[n-1] location
        while (k > 0) {
            int last = a[0];

            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = last;
            k--;
        }

        System.out.println(Arrays.toString(a));
    }
}
