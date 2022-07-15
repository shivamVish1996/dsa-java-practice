package ds.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {1, 5, 4, 2, 3, 7, 6};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    /**
     * we select minimum element from the array
     * and swap
     *
     * @param a input array to be sorted
     */
    private static void selectionSort(int[] a) {

        int minIndex;
        int n = a.length;
        for (int i = 0; i < n - 2; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            //swap a[i] with a[minIndex]
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;

        }
    }
}
