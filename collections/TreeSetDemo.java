package collections;

import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {
        //treeset - will sort and remove duplicate
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(1);
        set.add(6);
        set.add(4);
        set.add(0);

        set.forEach(System.out::println);

        System.out.println(set);

        Map map = new LinkedHashMap();
        map.put(1,2);
        map.put(1,3);
        map.put(7,9);
        map.put(1,3);
        map.put(4,2);

        System.out.println(map);



    }
}
