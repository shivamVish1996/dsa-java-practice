package practice;

public class CropStringTest {

    public static void main(String[] args) {
        String str1 = "http://windchill-dev-jaguar.msai.devops.ptc.io/Windchill";
        String str2 = "http://windchill-dev-jaguar.msai.devops.ptc.io/Windchill/sslClientAuth";
        String WINDCHILL = "Windchill";

//        System.out.println(str1);
//        System.out.println(str2);

//        System.out.println(str1.lastIndexOf('w'));
//        System.out.println(str1.indexOf('w'));
//        System.out.println(str1.indexOf("Windchill"));

//        System.out.println(str1.equals(str2));
         str1 = str1.substring(0, str1.indexOf(WINDCHILL) + WINDCHILL.length());
         str2 = str2.substring(0, str2.indexOf(WINDCHILL) + WINDCHILL.length());
//        System.out.println(str1);
//        System.out.println(str2);

//        System.out.println(str1.equals(str2));
//
//        System.out.println(String.format("this is some %s", str1));

        String baseIRConnector = "ptc-windchill-integration-connector";
   //     String str4 = "ptc-windchill-OData-connector";
        String str4 = "ptc-windchill-OData-connector_dup";

        String suffix = "";
        if (!str4.isEmpty() && str4.contains("_")) {
            System.out.println("has suffix");
            suffix = str4.substring(str4.lastIndexOf("_"));
        }

        System.out.println(suffix);
        baseIRConnector = baseIRConnector + suffix;
        System.out.println(baseIRConnector);
    }
}
