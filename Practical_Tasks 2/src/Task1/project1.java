package Task1;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to calculate?");
        int n;
        n = input.nextInt();
        System.out.println("Enter the numbers");
        double sum = 0;
        for(int i =0;i<n;i++)
        {
            sum =  sum + input.nextInt();
        }
        System.out.println(sum / n);

    }
}
