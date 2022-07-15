package java8.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> optionalName = Optional.ofNullable("shivam");
        System.out.println(optionalName.orElse("no name"));
    }
}
