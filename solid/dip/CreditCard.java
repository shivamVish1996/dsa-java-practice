package solid.dip;

public class CreditCard implements BankCard {

    public void doPayment(double amount) {
        System.out.println("payment using credit card");
    }
}
