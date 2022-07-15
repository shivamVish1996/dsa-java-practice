package ds.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 6, 3, 5, 2, 9};

        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));

    }

    private static void bubbleSort(int[] a) {

        int n = a.length;
        //rounds
        for (int i = 1; i < n; i++) {

            //check the condition
            for (int j = 0; j < n - i; j++) {
                if (a[j] > a[j + 1]) {

                    //swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
    }
}
