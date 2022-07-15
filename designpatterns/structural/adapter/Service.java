package designpatterns.structural.adapter;

public class Service implements IService {

    @Override
    public void serviceMethod(String specialData) {
        System.out.println("specialData: " + specialData);
    }
}
