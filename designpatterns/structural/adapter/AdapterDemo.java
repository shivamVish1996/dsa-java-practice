package designpatterns.structural.adapter;

/**
 * Intent
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 *
 *  Problem
 * Imagine that you’re creating a stock market monitoring app. The app downloads the stock data from multiple sources
 * in XML format and then displays nice-looking charts and diagrams for the user.
 *
 * At some point, you decide to improve the app by integrating a smart 3rd-party analytics library. But there’s a catch:
 * the analytics library only works with data in JSON format.
 *
 * The structure of the app before integration with the analytics library
 * You can’t use the analytics library “as is” because it expects the data in a format that’s incompatible with your app.
 *
 * You could change the library to work with XML. However, this might break some existing code that relies on the library.
 * And worse, you might not have access to the library’s source code in the first place, making this approach impossible.
 */
public class AdapterDemo {

    public static void main(String[] args) {
        IClient client = new Adapter(new Service());
        client.method("Shivam");
    }
}
