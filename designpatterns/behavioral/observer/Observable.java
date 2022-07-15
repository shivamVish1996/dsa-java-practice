package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable {

    private List<IObserver> observerList;
    private float temperature;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        //will notify observers if subject (temperature) has changed
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.stream()
                .forEach(observer -> {
                    observer.update(temperature);
                });
    }
}
