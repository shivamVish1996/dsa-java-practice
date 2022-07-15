package java8.streams;

import java.util.HashMap;
import java.util.Map;

public class MapPutStream {

    public static void main(String[] args) {
        Map<String, Map<String, String>> metadata = new HashMap<>();

        Map<String, String> metadataNumber = new HashMap<>();
        metadataNumber.put("label", "NumberLabel");
        metadataNumber.put("type", "String");

        Map<String, String> metadataVersion = new HashMap<>();
        metadataVersion.put("label", "VersionLabel");
        metadataVersion.put("type", "String");

        metadata.put("Number", metadataNumber);
        metadata.put("Version", metadataVersion);

        System.out.println(metadata);

        metadata.entrySet().stream()
                .filter(stringMapEntry -> stringMapEntry.getKey().equals("Number"))
                .map(Map.Entry::getValue)
                .map(stringStringMap -> stringStringMap.put("decoratedValue", "String"))
                .forEach(System.out::println);

    }
}
