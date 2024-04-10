import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\kgtenev20\\source\\repos\\2023-2024-JAVA-OOP\\input.txt";
        FileReader reader = null;
        try {
            reader = new FileReader(path);
            int c = reader.read();

            while (c >= 0) {
                System.out.print(Character.toChars(c));
                c = reader.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(reader != null){
                reader.close();
            }
        }
    }
}