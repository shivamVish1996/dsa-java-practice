package ds.array;

import java.util.Arrays;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] a = {1, 1, 3, 5, 5};
        int[] b = {2, 4, 4, 5, 6};

        int newArraySize = a.length + b.length-1;
        int[] c = new int[newArraySize];

        int i = 0, j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                c[k] = b[j];
                j++;
            } else if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = a[i];
                i++;
                j++;
            }
            k++;
        }

        System.out.println(Arrays.toString(c));


    }
}
