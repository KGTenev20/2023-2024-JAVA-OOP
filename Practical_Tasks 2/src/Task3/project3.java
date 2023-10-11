package Task3;
import java.util.Scanner;
public class project3 {
    public static boolean prime(int n) {
        int check =  n- 1;
        while (check > 1)
        {

            if (n % check == 0)
            {
                return false;
            }
            check = check-1;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(prime(n));
    }
}
