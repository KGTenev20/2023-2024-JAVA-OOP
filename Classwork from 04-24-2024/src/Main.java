import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\kgtenev20\\source\\repos\\2023-2024-JAVA-OOP\\input.txt";

        try {
            FileReader reader = new FileReader(path);

            BufferedReader buffReader = new BufferedReader(reader);
            String line = buffReader.readLine();

            while(line != null) {
                int sum = 0;

                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }

                System.out.println(sum);
                line = buffReader.readLine();
            }


            buffReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}