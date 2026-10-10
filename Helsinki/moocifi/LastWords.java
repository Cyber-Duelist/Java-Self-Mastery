package Helsinki.moocifi;

import java.util.Scanner;

public class LastWords {
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        while (true) {
            String input = reader.nextLine();
            if (input.isEmpty()) {
                System.out.println("Terminating!");
                break;
            }
            String[] pieces = input.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        }
        reader.close();
    }
}
