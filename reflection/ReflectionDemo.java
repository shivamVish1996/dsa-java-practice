package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class ReflectionDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<? extends Person> StudentClass = (Class<? extends Person>) Class.forName("reflection.Student");

        //newInstance() on class can create object for no arg constructor only, deprecated since java 9
        Person person = StudentClass.newInstance();
        System.out.println(person);

        System.out.println(StudentClass.getName());
        System.out.println(StudentClass.getSimpleName());
        Stream.of(StudentClass.getConstructors()).forEach(System.out::println);

        //create Student object from constructor
        Constructor<? extends Person> constructor1 = StudentClass.getConstructor();
        System.out.println(constructor1);
        Person shivamObject1 = constructor1.newInstance();
        System.out.println(shivamObject1);

        //create Student object from constructor with all parameters
        Constructor<? extends Person> constructor2 = StudentClass.getConstructor(int.class, String.class, int.class);
        System.out.println(constructor2);
        Person shivamObject2 = constructor2.newInstance(1, "Shivam", 25);
        System.out.println(shivamObject2);

        //create Student object from constructor with 2 parameters
        Constructor<? extends Person> constructor3 = StudentClass.getConstructor(String.class, int.class);
        System.out.println(constructor3);
        Person shivamObject3 = constructor3.newInstance("Shivam", 25);
        System.out.println(shivamObject3);

    }
}
