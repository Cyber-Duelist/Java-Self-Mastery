//Write a program that prompts the user for a year. If the user inputs a number that is smaller than 2015, then the program prints the string "Ancient history!"

package Helsinki.moocifi;
import java.util.Scanner;

public class Ancient{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a year: ");
        int year = Integer.valueOf(reader.nextLine());

        if (year < 2015) {
            System.out.println("Ancient history!");
        }

        reader.close();
    }
}