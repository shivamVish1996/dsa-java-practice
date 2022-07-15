package designpatterns.creational.factory.version1;

public class FactoryDemo {

    public static void main(String[] args) {
        String paymentMethod = "cash";
        double amountToWithdraw = 200.0;
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment(paymentMethod, amountToWithdraw);
    }
}
