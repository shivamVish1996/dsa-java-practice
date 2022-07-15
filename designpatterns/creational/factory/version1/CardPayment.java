package designpatterns.creational.factory.version1;

public class CardPayment implements IPayment {

    public static final String TYPE = "CARD";

    @Override
    public void makePayment(double amount) {
        System.out.println(amount + " amount withdrawn using card");
    }
}
