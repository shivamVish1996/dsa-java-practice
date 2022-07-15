package ds.hashtable;

import java.util.HashMap;
import java.util.HashSet;

public class PrintCommonElements {
    public static void main(String[] args) {
        int[] a = {1, 1, 3, 2, 2, 3, 5, 5, 5};
        int[] b = {1, 1, 4, 2, 5, 5, 5, 3, 4, 5};

        printCommonElements(a, b);

        printCommonElements2(a, b);
    }

    private static void printCommonElements2(int[] a, int[] b) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : a) {
            if (hashMap.containsKey(i)) {
                int oldFrequency = hashMap.get(i);
                int newFrequency = oldFrequency + 1;
                hashMap.replace(i, newFrequency);
            } else {
                hashMap.put(i, 1);
            }
        }

        for (int j : b) {
            if (hashMap.containsKey(j) && hashMap.get(j) > 0) {
                System.out.print(j + " ");
                int oldCount = hashMap.get(j);
                int newCount = oldCount - 1;
                hashMap.put(j, newCount);
            }
        }

        // System.out.println(hashMap);
    }

    private static void printCommonElements(int[] a, int[] b) {

        HashSet<Integer> s = new HashSet<>();
        for (int k : a) {
            s.add(k);
        }

        for (int j : b) {
            if (s.contains(j)) {
                System.out.print(j + " ");
                s.remove(j);
            }
        }
        System.out.println();
    }
}
