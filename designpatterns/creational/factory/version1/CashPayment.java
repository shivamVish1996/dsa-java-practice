package designpatterns.creational.factory.version1;

public class CashPayment implements IPayment {

    public static final String TYPE = "CASH";

    @Override
    public void makePayment(double amount) {
        System.out.println(amount + " amount withdrawn using cash");
    }
}
