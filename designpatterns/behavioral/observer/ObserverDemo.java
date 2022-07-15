package designpatterns.behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Observable observable = new Observable();
        IObserver observer1 = new Observer();
        IObserver observer2 = new Observer();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setTemperature(36.0f);

        observable.removeObserver(observer1);

        System.out.println("-----------------");

        observable.setTemperature(44.0f);
    }
}
