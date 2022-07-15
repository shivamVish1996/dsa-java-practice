package oops;

class Parent {
    void m1() {
        this.m2();
    }

    void m2() {
        System.out.println("Parent:m2");
    }
}

class Child extends Parent {

    void m1() {
        super.m1();
    }


    void m2() {
        System.out.println("Child:m2");
    }

    void m3() {
        System.out.println("Child:m3");
    }

}

class Main {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        parent1.m1();
        parent1.m2();
     //   parent1.m3();
    }
}
