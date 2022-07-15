package ds.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {3, 1, 5, 7, 2, 0, 9};

        System.out.println(Arrays.toString(a));
        int s = 0;
        int e = a.length - 1;
        quicksort(a, s, e);

        System.out.println(Arrays.toString(a));
    }

    private static void quicksort(int[] a, int s, int e) {

        if (s >= e)
            return;

        int p = partition(a, s, e);

        quicksort(a, s, p - 1);
        quicksort(a, p + 1, e);
    }

    private static int partition(int[] a, int s, int e) {
        int pivotIndex;
        int pivotElement = a[s];

        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (a[i] <= pivotElement)
                count++;
        }
        pivotIndex = s + count;

        //swap a[pivotIndex], a[s];
        int temp1 = a[pivotIndex];
        a[pivotIndex] = a[s];
        a[s] = temp1;

        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex) {
            if (a[i] < pivotElement)
                i++;
            if (a[j] > pivotElement)
                j--;
            if (i < pivotIndex && j > pivotIndex) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            i++;
            j--;
        }
        return pivotIndex;
    }
}
