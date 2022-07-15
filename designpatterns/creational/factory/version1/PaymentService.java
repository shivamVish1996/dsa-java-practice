package designpatterns.creational.factory.version1;

public class PaymentService {

    public void makePayment(String paymentMethod, double amount) {
        IPayment payment = PaymentFactory.getPayment(paymentMethod);
        payment.makePayment(amount);
    }
}
