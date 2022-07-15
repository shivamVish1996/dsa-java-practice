package collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, List<Animal>> map = new HashMap<>();
        List<Animal> list = new ArrayList<>();
        map.put("dogId", list);

        list.add(new Animal());
        list.add(new Animal("cat", "animal"));

        System.out.println(map);

        String str = null;
        System.out.println(str);

    }
}

class Animal {
    private String name;
    private String type;

    public Animal() {
        name = "dog";
        type = "animal";
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
