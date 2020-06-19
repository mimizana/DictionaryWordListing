
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryWordListing {

    public static void main(String[] args) {
//Read ten word from the user
        Scanner scanner = new Scanner(System.in);
        String words[] = new String[10];
        System.out.print("Enter 10 words : ");
        for (int i = 0; i < 10; i++) {
            words[i] = scanner.next();
        }
//print the word in original order
        System.out.print("Original Order: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(words[i] + " ");

        }

        String temp;
        for (int j = 0; j < words.length; j++) {
            for (int i = j + 1; i < words.length; i++) {
                if (words[i].compareTo(words[j]) < 0) {
                    temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                }
            }
        }
        System.out.println("");
        // print the word in alphabetical order
        System.out.println("Alphabetical Order: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(words[i] + " ");
            System.out.print("");
        }

        System.out.print("Reverse Order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(words[i]+ " " );
            ;
        }


    }

}




