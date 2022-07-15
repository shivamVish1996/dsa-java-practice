package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("shivam1");
        stringList1.add("sachin1");
        stringList1.add("krsna1");

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("shivam2");
        stringList2.add("sachin2");
        stringList2.add("krsna2");

        List<String> stringList3 = new ArrayList<>();
        stringList3.add("shivam3");
        stringList3.add("sachin3");
        stringList3.add("krsna3");

        List<List<String>> listStringList = new ArrayList<>();
        listStringList.add(stringList1);
        listStringList.add(stringList2);
        listStringList.add(stringList3);

        List<String> finalString = listStringList.stream()
                .flatMap(stringList -> stringList.stream())
                .collect(Collectors.toList());

        finalString.stream()
                .forEach(System.out::println);

    }
}
