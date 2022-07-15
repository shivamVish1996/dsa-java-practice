package ds.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 6, 3, 4};
        System.out.println(Arrays.toString(a));
        int l = 0, r = a.length - 1;
        mergeSort(a, l, r);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] a, int l, int r) {

        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }

    }

    private static void merge(int[] a, int l, int mid, int r) {

        // Find sizes of two subarrays to be merged
        int n1 = mid - l + 1;
        int n2 = r - mid;

        /* Create temp arrays */
        int[] f = new int[n1];
        int[] s = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; i++) {
            f[i] = a[l + i];
        }
        for (int i = 0; i < n2; i++) {
            s[i] = a[mid + 1 + i];
        }

        /* Merge the temp arrays using 2 pointer approach*/

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (f[i] > s[j]) {
                a[k] = s[j];
                j++;
            } else if (f[i] < s[j]) {
                a[k] = f[i];
                i++;
            } else {
                a[k] = f[i];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            a[k] = f[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            a[k] = s[j];
            j++;
            k++;
        }
    }
}
