import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> personKg = new HashMap<>();
        personKg.put("Ivan", 70.5);
        personKg.put("Georgi", 80.0);
        personKg.putIfAbsent("Pesho", 90.0);
        personKg.put("Martin", 71.5);

        /*System.out.println(personKg.get("Ivan"));

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Pesho");

        System.out.println(names.get(1));*/

        Set<String> keys = personKg.keySet();
        for(String key : keys){
            System.out.println(key + " - " + personKg.get(key));
        }

        Collection<Double> values = personKg.values();
        for(Double value : values){
            System.out.println(value);
        }

        Set<Map.Entry<String, Double>> entries = personKg.entrySet();
        for(Map.Entry<String, Double> entry : entries){
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
    }
}