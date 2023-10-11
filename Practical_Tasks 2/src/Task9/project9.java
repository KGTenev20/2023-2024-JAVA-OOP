package Task9;
import java.util.Scanner;
public class project9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double c,f;
        int choice;

        System.out.println("1. C->F");
        System.out.println("2. F->C");
        choice = input.nextInt();
        if(choice == 2)
        {
            System.out.print("F = ");
            f = input.nextDouble();
            c = (f - 32) * 5/9;
            System.out.println("C = " + c);
        }
        else if(choice == 1)
        {
            System.out.print("C = ");
            c = input.nextDouble();
            f = (c * 9/5) + 32;
            System.out.println("F = " + f);
        }
    }

}