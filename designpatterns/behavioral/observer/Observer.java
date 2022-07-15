package designpatterns.behavioral.observer;

public class Observer implements IObserver{

    @Override
    public void update(float temperature) {
        //will do something after getting temperature
        System.out.println("Subject (temperature) has changed, do something");
        System.out.println("temperature: " + temperature);
    }
}
