package solid.dip;

/**
 * Dependency Inversion Principle (DIP)
 * <p>
 * The principle states that we must use abstraction (abstract classes and interfaces) instead of concrete
 * implementations. High-level modules should not depend on the low-level module but both should depend on the abstraction
 */
public class ShoppingMall {

    private BankCard bankCard;

    //If we specify DebitCard or CreditCard, it will be tightly coupled. If we want to change,
    // changes need to be done everywhere
    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public static void main(String[] args) {

        //If we specify DebitCard or CreditCard, it will be tightly coupled. If we want to change,
        // changes need to be done everywhere
        BankCard debitCard = new DebitCard();

        ShoppingMall shoppingMall = new ShoppingMall(debitCard);

        shoppingMall.doPurchaseSomething(10000);
    }

    public void doPurchaseSomething(double amount) {
        bankCard.doPayment(amount);
    }

}
