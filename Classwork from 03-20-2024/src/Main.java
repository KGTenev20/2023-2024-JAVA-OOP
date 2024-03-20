import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ivan");
        names.add("Gosho");
        names.add("Tosho");
        names.add("ivan");

        for(String name: names){
            System.out.println(name);
        }

        names.forEach(e -> System.out.println(e));

        CustomList<String> customNames = new CustomList<>();
        customNames.add("Ivan");
        customNames.add("Gosho");
        customNames.add("Tosho");
        customNames.add("Petkan");

        for(String name: customNames){
            System.out.println(name);
        }

        customNames.forEach(e -> System.out.println(e));

        Iterator<String> iterator = customNames.iterator();
    }
}