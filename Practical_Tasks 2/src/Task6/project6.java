package Task6;
import java.util.Scanner;

public class project6 {
    public static boolean palindrome(String str) {
        int b = str.length();
        int a = 0;
        b--;

        while (a < b) {
            if (str.charAt(a) != str.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(palindrome(str));
    }
}
