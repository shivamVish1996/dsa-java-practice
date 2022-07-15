package oops.staticdemo;

public class StaticDemo {

    private static int classVariable = 5;

    private int objVariable = 7;

    static {
        classVariable = 10;
    }

    {
        classVariable = 15;
        objVariable = 14;
    }

    public static void printClassVariable(){
        System.out.println(classVariable);
        StaticDemo staticDemo = new StaticDemo();
        System.out.println(staticDemo.objVariable);
    }

    public void printData(){
        System.out.println(classVariable);
        System.out.println(objVariable);
        printClassVariable();
    }

    public static void main(String[] args) {
        printClassVariable();
        new StaticDemo().printData();
    }
}
