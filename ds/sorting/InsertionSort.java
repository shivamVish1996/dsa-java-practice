package ds.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 6, 3, 4};
        System.out.println(Arrays.toString(a));
        //take next element and add in the already sorted array
        int j;
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            j = i - 1;
            while (j >= 0) {
                if (temp < a[j]) {
                    //shift
                    a[j + 1] = a[j];
                } else break;
                j--;
            }
            a[j + 1] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
