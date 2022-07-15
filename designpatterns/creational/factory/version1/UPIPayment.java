package designpatterns.creational.factory.version1;

public class UPIPayment implements IPayment {

    public static final String TYPE = "UPI";

    @Override
    public void makePayment(double amount) {
        System.out.println(amount + " amount withdrawn using  UPI");
    }
}
