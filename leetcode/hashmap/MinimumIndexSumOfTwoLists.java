package leetcode.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class MinimumIndexSumOfTwoLists {

    public static String[] findRestaurant(String[] list1, String[] list2) {

        TreeMap<Integer, List<String>> treeMap = new TreeMap<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equalsIgnoreCase(list2[j])) {
                    int indexSum = i + j;
                    if (treeMap.containsKey(indexSum)) {
                        List<String> stringList = treeMap.get(indexSum);
                        stringList.add(list1[i]);
                        treeMap.put(indexSum, stringList);
                    } else {
                        List<String> l = new ArrayList<>();
                        l.add(list1[i]);
                        treeMap.put(indexSum, l);
                    }
                }
            }
        }
        return treeMap.firstEntry().getValue().toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "KFC", "Hungry Hunter Steakhouse", "Shogun"};

        System.out.println(Arrays.toString(findRestaurant(list1, list2)));

    }
}
