package designpatterns.creational.singleton;

public class Singleton {

    private static Singleton uniqueObject = new Singleton(); //for eager loading

    private Singleton() {
    }

    public static Singleton getInstance() {
//        for lazy loading
//        if (uniqueObject == null)
//            uniqueObject = new Singleton();
        return uniqueObject;
    }

}

class SingletonDemo {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        System.out.println(s);
        System.out.println(s1);

    }
}
