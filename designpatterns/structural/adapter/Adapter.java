package designpatterns.structural.adapter;

/**
 * The Adapter is a class that’s able to work with both the client and the service: it implements the client interface,
 * while wrapping the service object. The adapter receives calls from the client via the adapter interface and translates
 * them into calls to the wrapped service object in a format it can understand.
 */
//Adapter will implements (is a) IClient/IClient and composed (has a) of IService/Adaptee
public class Adapter implements IClient {

    IService service;

    public Adapter() {
    }

    public Adapter(IService service) {
        this.service = service;
    }

    @Override
    public void method(String data) {
        //convert to specific data which service understand
        //specialData = convertToFormatWhichServiceCanUnderstand(data)
        data = data + " understandable";
        service.serviceMethod(data);
    }
}
