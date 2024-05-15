import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class tasks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length  =  Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");
        Predicate<String> checkNameSizeLessThanInputLength =
                e -> e.length() <= length;

        Arrays.stream(names)
                .filter(checkNameSizeLessThanInputLength)
                .forEach(e -> System.out.println(e));

        System.out.println("-----");
        Arrays.stream(names).forEach(e -> System.out.println(e));
    }
}
