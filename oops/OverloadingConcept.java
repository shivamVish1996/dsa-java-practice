package oops;

public class OverloadingConcept {

    public static void main(String[] args) {
        OverloadingConcept overloadingConcept = new OverloadingConcept();
        overloadingConcept.print(7, null);
    }

    void print(int number, Object obj) {
        System.out.println("Object");
    }

    void print(int number, String str) {
        System.out.println("String");
    }

}
