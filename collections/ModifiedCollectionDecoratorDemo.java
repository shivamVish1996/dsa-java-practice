package collections;

import java.util.*;
import java.util.stream.Collectors;

public class ModifiedCollectionDecoratorDemo {

    public static void main(String[] args) {
        //    Map<Map.Entry<Attribute, Decorator>, Map<paramKey, paramValue>>
        Map<Map.Entry<String, String>, Map<String, String>> decoratorsInfo = new HashMap<>();

        Map.Entry mapEntry1 = new AbstractMap.SimpleEntry("Number", "LinkToAppDecorator");
        Map<String, String> paramMap1 = new HashMap<>();
        paramMap1.put("appId1", "PTC.Nav.PartList1");
        paramMap1.put("appId2", "PTC.Nav.PartList2");
        decoratorsInfo.put(mapEntry1, paramMap1);

        Map.Entry mapEntry2 = new AbstractMap.SimpleEntry("Version", "LinkToAppDecorator");
        Map<String, String> paramMap2 = new HashMap<>();
        paramMap2.put("appId", "PTC.Nav.PartList");
        decoratorsInfo.put(mapEntry2, paramMap2);

        Map.Entry mapEntry3 = new AbstractMap.SimpleEntry("CabinetName", "LandingDecorator");
        Map<String, String> paramMap3 = new HashMap<>();
        paramMap3.put("appId", "PTC.Nav.PartStructure");
        decoratorsInfo.put(mapEntry3, paramMap3);

        System.out.println(decoratorsInfo);

        Set<String> decorators = getDecorators(decoratorsInfo);
        System.out.println("decorators: "+decorators);

        Set<String> attributesToDecorate = getAttributesToDecorate(decoratorsInfo);
        System.out.println("attributes: "+attributesToDecorate);

        Collection<Map<String, String>> values = decoratorsInfo.values();
        System.out.println(values);

        for (String attributeToDecorate : attributesToDecorate) {

            System.out.println("----info for attribute---");
            System.out.println("attribute: " + attributeToDecorate);

            String decoratorForAttribute = getDecoratorForAttribute(attributeToDecorate, decoratorsInfo);
            System.out.println("decoratorForAttribute: " + decoratorForAttribute);
            System.out.println(attributeToDecorate + "->" + decoratorForAttribute);

            //    Map<String, String> parametersForAttribute = getParametersForAttribute(attributeToDecorate, decoratorForAttribute, decoratorsInfo);

            Map<String, String> parametersForAttribute = decoratorsInfo.get(new AbstractMap.SimpleEntry<>(attributeToDecorate, decoratorForAttribute));
            System.out.println("parameters: " + parametersForAttribute);
            System.out.println();
        }
    }

    private static Set<String> getDecorators(Map<Map.Entry<String, String>, Map<String, String>> decoratorsInfo) {

        return decoratorsInfo.keySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toSet());
    }

    private static Map<String, String> getParametersForAttribute(String attributeToDecorate, String decoratorForAttribute,
                                                                 Map<Map.Entry<String, String>, Map<String, String>> decoratorsInfo) {
        return decoratorsInfo.get(new AbstractMap.SimpleEntry<>(attributeToDecorate, decoratorForAttribute));

    }

    private static String getDecoratorForAttribute(String attributeToDecorate,
                                                   Map<Map.Entry<String, String>, Map<String, String>> decoratorsInfo) {

        return decoratorsInfo.keySet().stream()
                .filter(stringStringEntry -> stringStringEntry.getKey().equals(attributeToDecorate))
                .map(Map.Entry::getValue)
                .findFirst().orElse(null);

    }

    private static Set<String> getAttributesToDecorate(Map<Map.Entry<String, String>, Map<String, String>> decoratorsInfo) {

        return decoratorsInfo.keySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }


}
