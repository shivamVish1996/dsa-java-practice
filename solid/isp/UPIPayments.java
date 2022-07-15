package solid.isp;

/**
 * Interface Segregation Principle (ISP)
 *
 * This principle is the first principle that applies to Interfaces instead of classes in SOLID and
 * it is similar to the single responsibility principle. It states that “do not force any client to
 * implement an interface which is irrelevant to them“.
 */
public interface UPIPayments {

    void payMoney();

    void getScratchCard();
}
