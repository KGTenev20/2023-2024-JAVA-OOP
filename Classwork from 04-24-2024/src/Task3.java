import java.io.*;
import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        String path = "C:\\Users\\kgtenev20\\source\\repos\\2023-2024-JAVA-OOP\\input.txt";
        String outputPath = "C:\\Users\\kgtenev20\\source\\repos\\2023-2024-JAVA-OOP\\output.txt";
        try {
            FileReader reader = new FileReader(path);
            BufferedReader buffReader = new BufferedReader(reader);

            FileWriter writer = new FileWriter(outputPath);
            BufferedWriter buffWriter = new BufferedWriter(writer);

            String line = buffReader.readLine();

            while(line != null) {
                buffWriter.write(line.toUpperCase());
                buffWriter.newLine();
                line = buffReader.readLine();
            }

            buffWriter.close();
            buffReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
