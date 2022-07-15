package collections;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        List<String> wcInstances = Arrays.asList("windchill", "windchill2", "windchill3");
        Map<String, List<String>> mapOfAttributes = new HashMap<>();

        List<String> attributesList1 = Arrays.asList("Name", "Soft attribute", "Number");
        mapOfAttributes.put(wcInstances.get(0), attributesList1);

        List<String> attributesList2 = Arrays.asList("Name", "Soft attribute");
        mapOfAttributes.put(wcInstances.get(1), attributesList2);

        List<String> attributesList3 = Arrays.asList("Soft attribute", "Number");
        mapOfAttributes.put(wcInstances.get(2), attributesList3);

        Map<String, List<String>> attributeToWcInstanceMap = new HashMap<>();
        List<String> listOfWindchill;

        for (String wcInstance : wcInstances) {
            List<String> attrList = mapOfAttributes.get(wcInstance);
            for (String attribute : attrList) {
                if (attributeToWcInstanceMap.containsKey(attribute))
                    listOfWindchill = attributeToWcInstanceMap.get(attribute);
                else
                    listOfWindchill = new ArrayList<>();

                listOfWindchill.add(wcInstance);
                attributeToWcInstanceMap.put(attribute, listOfWindchill);
            }
        }

     //   System.out.println(attributeToWcInstanceMap);

        Map<String, String> mapForTest = new HashMap<>();
//        mapForTest.put("key1", "value1");
//        mapForTest.put("key2", "value2");
//        mapForTest.put("key3", "value3");

        System.out.println(mapForTest.containsKey("this"));


//
//        System.out.println(mapForTest.remove("key1"));
//
//        mapForTest.entrySet()
//                .stream()
//                .forEach(System.out::println);

    }

}
