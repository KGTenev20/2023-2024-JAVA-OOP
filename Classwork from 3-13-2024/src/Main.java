import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Georgi");
        names.add("Dragan");
        names.add("Ivan");

        Collections.sort(names);
        names.forEach(e -> System.out.println(e));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Spike", "Beagle", 7));
        dogs.add(new Dog("Rex", "German Sheppard", 2));
        dogs.add(new Dog("Charlie", "Samoed", 4));
        dogs.add(new Dog("Sharo", "Karakachanka", 4));

        Dog first = new Dog("Rex", "Doberman", 10);
        Dog second = new Dog("Charlie", "Doberman", 2);
        System.out.println(first.compareTo(second));

        Collection.sort(dogs);

        for(Dog dog : dogs){
            System.out.println(dog.getName() + " - " + dog.getAge());
        }
    }
}