package designpatterns.structural.adapter;

/**
 * The Service is some useful class (usually 3rd-party or legacy). The client can’t use this class directly because it
 * has an incompatible interface.
 */
public interface IService {

    void serviceMethod(String specialData);
}
