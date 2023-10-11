package Task2;
import java.util.Scanner;
public class project2
{
    public static int factoriel(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        return n * factoriel(n-1);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        System.out.println(n+"!"+" = "+ factoriel(n));
    }
}