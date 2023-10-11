package Task4;
import java.util.Scanner;
public class project4 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        char operation;
        int a,b;
        System.out.println("What operation do you want to use?");
        operation = input.next().charAt(0);
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        switch (operation)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }

}
