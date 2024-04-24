import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\kgtenev20\\source\\repos\\2023-2024-JAVA-OOP\\input.txt";

        try {
            FileReader reader = new FileReader(path);

            int character = reader.read();
            int sum = 0;

            while(character >= 0) {
                sum += character;
                character = reader.read();
            }


            System.out.println(sum);
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
