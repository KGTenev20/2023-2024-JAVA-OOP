package Task5;
import java.util.Scanner;
import java.util.Random;

public class project5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(101);
        System.out.println("Guess my number(0-100)");
        while(true)
        {
            int n = input.nextInt();
            if(a == n)
            {
                System.out.println("Correct!");
                break;
            }
            else
            {
                if(a >n)
                {
                    System.out.println(">");
                }
                else
                {
                    System.out.println("<");
                }
            }
        }

    }


}