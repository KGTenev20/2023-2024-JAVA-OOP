import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\kgtenev20\\source\\repos\\2023-2024-JAVA-OOP\\input.txt";
        String outputPath = "C:\\Users\\kgtenev20\\source\\repos\\2023-2024-JAVA-OOP\\output.txt";
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        FileReader reader = new FileReader(path);
        int characterInt = reader.read();
        while (characterInt >= 0) {
            char character = (char) characterInt;
            if (characterInt >= 'A' || characterInt <= 'Z') {
                consonants++;
            }
            if (characterInt >= 'a' || characterInt <= 'z') {
                if (character == 'a' || character == 'e' ||
                        character == 'i' || character == 'o' ||
                        character == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            if (character == '!' || character == ',' ||
                    character == '.' || character == '?') {
                punctuation++;
            }

            characterInt = reader.read();
        }
        Path pathOutput = Paths.get(outputPath);
        Files.write(pathOutput, );
        FileWriter writer = new FileWriter(outputPath);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        StringBuilder builder = new StringBuilder();
        String finalResutl = builder
                .append("Vowels: " + vowels).append("\n")
                .append("Cons: "+consonants).append("\n")
                .append("Punc" + punctuation).toString();
        System.out.println(finalResutl);
        Files.write(pathOutput, finalResutl);


        reader.close();
        bufferedWriter.close();
    }
}
