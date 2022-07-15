package practice;

public class CCOTest {


    enum Test{
    value1, value2, value3;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "WindchillDemoPartResourceProvider:OR:wt.part.WTPart:79973";
        String[] s = str.split(":",2);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }


        System.out.println(Test.value1);
        System.out.println(Test.values().length);

        for (Test t : Test.values()
        ) {
            System.out.println(t.toString());
        }

String resId = "WindchillDemoPartResourceProvider:OR:wt.part.WTPart:79973";
        String resProviderthing = resId.substring(0, resId.indexOf(':'));
System.out.println(resProviderthing);

        outerloop:
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    break outerloop;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Done");

        String selectedRow = "WindchillDemoPartResourceProvider:OR:wt.part.WTPart:79973";
        String resProvider = selectedRow.substring(0, selectedRow.indexOf(':'));
        String id = selectedRow.substring(selectedRow.indexOf(':')+1);

        System.out.println(resProvider);
        System.out.println(id);
    }
}
