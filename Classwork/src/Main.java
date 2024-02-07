import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List strings = new ArrayList();
        strings.add(10);
        strings.add("asd");
        strings.add(new Dog());

        String first = (String) strings.get(0);
        System.out.println(first);
    }
}