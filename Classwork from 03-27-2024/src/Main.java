import com.sun.jdi.InvalidStackFrameException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            read();
        } catch (FileNotFoundException e) {
            throw new CrazyException("Crazy exception throwed");
        } finally {
            System.out.println("FINALLY!");
        }

            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println(a / b);


        System.out.println("after try-catch");
    }

    public static void read() throws FileNotFoundException{
            BufferedReader reader =
                    new BufferedReader(new FileReader("src/main/resources/input.txt"));

            System.out.println("After reader");
    }

    /*private static void processFile(BufferedReader reader) throws IOException {
        String inputLine = null;
        while((inputLine = reader.readLine()) != null)
            performOperation(inputLine);
    }*/

    /*private static void performOperation(String inputLine) throws InvalidStackFrameException {
        String[] parts = inputLine.split(" ");
        if(parts.length != 3)
            throw new InvalidStatementException (
                    "Statement must have 3 parts : operation leftVal rightVal");
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase())
    }*/
}