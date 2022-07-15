package java8.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MapStream {

    public static void main(String[] args) {
        Map<String, Map<String, Map<String, String>>> applicableDecoratorsInfo = new HashMap<>();

        Map<String, Map<String, String>> decoratorToParametersMap1 = new HashMap<>();
        Map<String, Map<String, String>> decoratorToParametersMap2 = new HashMap<>();

        Map<String, String> mapOfParameters1 = new HashMap<>();
        mapOfParameters1.put("parameterKey1", "parameterValue1");
        Map<String, String> mapOfParameters2 = new HashMap<>();
        mapOfParameters2.put("parameterKey1", "parameterValue2");

        decoratorToParametersMap1.put("thingName1", mapOfParameters1);
        decoratorToParametersMap2.put("thingName1", mapOfParameters2);

        applicableDecoratorsInfo.put("attributeToDecorate1", decoratorToParametersMap1);
        applicableDecoratorsInfo.put("attributeToDecorate2", decoratorToParametersMap2);

        System.out.println(applicableDecoratorsInfo);

        //to fetch decorators
        Set<String> decoratorsList = applicableDecoratorsInfo.values()
                .stream()
                .map(Map::keySet)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        System.out.println(decoratorsList);

        //to fetch attributes
        final List<String> attributesList = new ArrayList<>(applicableDecoratorsInfo.keySet());

        System.out.println(attributesList);

        //to get parameters map for given decorator
     //   BinaryOperator<String> mergeFunction = (oldValue, newValue) -> newValue;
        Map<String, String> parametersList = applicableDecoratorsInfo.values()
                .stream()
                .filter(decoratorToParameterMap -> decoratorToParameterMap.containsKey("thingName1"))
                .map(Map::values)
                .flatMap(Collection::stream)
                .flatMap(parameterMap -> parameterMap.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> newValue));

        System.out.println(parametersList);

        //get attributes to decorate for given decorator
        List<String> attributesListForDecorator = applicableDecoratorsInfo.entrySet()
                .stream()
                .filter(applicableDecoratorsEntry -> applicableDecoratorsEntry.getValue().containsKey("thingName2"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(attributesListForDecorator);
    }
}
