package ds.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCountOfEachElement {

    public static void main(String[] args) {
        int[] a = {1, 5, 2, 3, 1, 5, 6, 1, 3, 6, 1};
        printFrequencyOfEachElement(a);
    }

    private static void printFrequencyOfEachElement(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : a) {
            if (map.containsKey(i)) {
                int oldFrequency = map.get(i);
                int newFrequency = oldFrequency + 1;
                map.replace(i, newFrequency);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }
}
