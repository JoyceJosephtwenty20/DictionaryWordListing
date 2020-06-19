
import java.util.Scanner;
    public class DictionaryWordListing {
        public static void main(String[] args) {

        {
            String[] tenWords;
            tenWords = new String[10];
            String alphabet;
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.println("Please enter words #:" + (i + 1));
                tenWords[i] = input.next();

                // printing the string without the brackets

            }
            System.out.println("\nOriginal Order: ");
            System.out.print(" " +(tenWords[0]));
            System.out.print(" " +(tenWords[1]));
            System.out.print(" " +(tenWords[2]));
            System.out.print(" " +(tenWords[3]));
            System.out.print(" " +(tenWords[4]));
            System.out.print(" " +(tenWords[5]));
            System.out.print(" " +(tenWords[6]));
            System.out.print(" " +(tenWords[7]));
            System.out.print(" " +(tenWords[8]));
            System.out.print(" " +(tenWords[9]));

            //Sorting the List below

            for (int a = 1; a < 10; a++) {
                for (int b = 0; b < 10 - a; b++) {
                    if (tenWords[b].compareTo(tenWords[b + 1]) > 0) {
                        alphabet = tenWords[b];
                        tenWords[b] = tenWords[b + 1];
                        tenWords[b + 1] = alphabet;
                    }
                }
            }
            System.out.println("\nAlphabetical Order:");
            for (int i = 0; i < 10; i++) {
                System.out.print(" " + tenWords[i]);
            }

            System.out.println("\nReversed Order:");

            // Printing the reversed order without the brackets

            System.out.print(" " +(tenWords[9]));
            System.out.print(" " +(tenWords[8]));
            System.out.print(" " +(tenWords[7]));
            System.out.print(" " +(tenWords[6]));
            System.out.print(" " +(tenWords[5]));
            System.out.print(" " +(tenWords[4]));
            System.out.print(" " +(tenWords[3]));
            System.out.print(" " +(tenWords[2]));
            System.out.print(" " +(tenWords[1]));
            System.out.print(" " +(tenWords[0]));

        }

    }

}
