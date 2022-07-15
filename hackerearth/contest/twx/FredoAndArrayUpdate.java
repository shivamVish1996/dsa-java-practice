package hackerearth.contest.twx;

import java.util.Arrays;
import java.util.Scanner;

public class FredoAndArrayUpdate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //size
        int n = sc.nextInt();

        //array input
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //find sum
        int initialSum = 0;
        for (int i = 0; i < a.length; i++) {
            initialSum = initialSum + a[i];
        }

        int startValue = initialSum / a.length;
        int x = 0;
        for (int i = startValue; i < a.length; i++) {
            if (initialSum < i * a.length) {
                x = i;
                break;
            }
        }
        System.out.println(x);
    }
}
