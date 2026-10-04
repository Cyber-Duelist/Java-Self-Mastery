//Write a program that prompts the user for an integer and informs the user whether or not it is positive (greater than zero).

package Helsinki.moocifi;
import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = Integer.valueOf(reader.nextLine());

        if (num > 0) {
            System.out.println("The number is positve.");
        } else {
            System.out.println("The number is negative.");
        }

        reader.close();
    }


}