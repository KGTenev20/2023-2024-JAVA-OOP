package Task7;

import java.util.Scanner;
public class project7 {
    public static String reverseWords(String sentence)
    {
        String[] words = sentence.split("\\s+");
        StringBuilder reverse= new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--)
        {
            reverse.append(words[i]).append(" ");
        }

        return reverse.toString().trim();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please write a sentence");
        String sentence = input.nextLine();

        String reversedSentence = reverseWords(sentence);

        System.out.println(reversedSentence);
    }


}