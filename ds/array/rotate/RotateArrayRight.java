package ds.array.rotate;

import java.util.Arrays;

public class RotateArrayRight {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(Arrays.toString(a));
        int n = a.length;

        while (k > 0) {
            int first = a[n - 1];

            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = first;

            k--;
        }
        System.out.println(Arrays.toString(a));
    }
}
