import java.io.*;
import java.util.Scanner;

public class Writter {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\kgtenev20\\source\\repos\\2023-2024-JAVA-OOP\\input.txt";

        String outputPath = "C:\\Users\\kgtenev20\\source\\repos\\2023-2024-JAVA-OOP\\empty.txt";

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputPath));

        FileReader reader = null;
        FileWriter writer = null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            reader = new FileReader(inputPath);
            writer = new FileWriter(outputPath);

            bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);

            String line = bufferedReader.readLine();

            while (line != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }

            writer.write(reader.read());

        } catch (FileNotFoundException e) {
            System.out.println("Read file not found");
        } catch (IOException e) {
            System.out.println("Write file not found");
        } finally {
            reader.close();
            writer.close();
        }
    }
}
