package Helsinki.moocifi;
import java.util.Scanner;

public class AdvancedAstrologyPart1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number of spaces: ");
        int spaces = Integer.valueOf(reader.nextLine());

        System.out.print("Enter number of stars: ");
        int stars = Integer.valueOf(reader.nextLine());

        
        printSpaces(spaces);
        printStars(stars);

        reader.close();
    }

    
    public static void printSpaces(int number) {
        System.out.print(" ".repeat(number));
    }

    
    public static void printStars(int number) {
        System.out.print("*".repeat(number));
    }
}
