package solid.lsp;

/**
 * Liskov substitution Principle (LSP)
 * <p>
 * This principle states that “Derived or child classes must be substitutable for their base or parent classes”.
 * In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting
 * the behavior of the program.
 */
public abstract class SocialMedia {
    //@support WhatsApp,Facebook,Instagram
    public abstract void chatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public abstract void groupVideoCall(String... users);
}
