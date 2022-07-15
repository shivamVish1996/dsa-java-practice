package solid.ocp;

/**
 * Open closed Principle (OCP)
 * <p>
 * This principle states that “software entities (classes, modules, functions, etc.) should be open for extension,
 * but closed for modification” which means you should be able to extend a class behavior, without modifying it.
 */
public interface NotificationService {

    public void sendNotification();
}
