package designpatterns.creational.factory.version1;

public class PaymentFactory {

    public static IPayment getPayment(String paymentType) {
        IPayment payment;

        switch (paymentType.toUpperCase()) {
            case CardPayment.TYPE:
                payment = new CardPayment();
                break;

            case CashPayment.TYPE:
                payment = new CashPayment();
                break;

            case UPIPayment.TYPE:
                payment = new UPIPayment();
                break;

            default:
                throw new IllegalArgumentException(String.format("There is no IPayment that supports type %s", paymentType));
        }

        return payment;
    }

}