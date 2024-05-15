import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<String, Integer> stringToInt = e -> Integer.parseInt(e);
        System.out.println(stringToInt.apply("10"));

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(stringToInt)
                .collect(Collectors.toList());

        Function<Integer, Boolean> predicate = e -> e % 2 != 0; //same
        Predicate<Integer> oddNumbers = e -> e % 2 != 0; // same


        System.out.println(oddNumbers.test(10));
        numbers.removeIf(oddNumbers);
        Consumer<Integer> printNumber = e -> System.out.print(e + " ");
        printNumber.accept(10000);
        numbers.forEach(printNumber);


        System.out.println();
        Comparator<Integer> compareTwoNumbersInAscendingOrder = (a, b) -> a.compareTo(b);
        numbers.sort(compareTwoNumbersInAscendingOrder);
        numbers.forEach(printNumber);
        // a kum b e ot nisko kum visoko a b kum a e visoko kum
        // nisko sortirane

        Supplier<Integer> supplierWithNumber = () -> 10;
        System.out.println(supplierWithNumber.get());

        BiFunction<Integer, String, String> intPlusStringToString = (a,b) -> a + b;
        System.out.println(intPlusStringToString.apply(10, "asd"));
    }
}