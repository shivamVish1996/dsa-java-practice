package solid.dip;

public class DebitCard implements BankCard {
    public void doPayment(double amount) {
        System.out.println("payment using debit card");
    }
}
