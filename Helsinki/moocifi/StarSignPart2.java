// In this part I will print square from stars.

package Helsinki.moocifi;
import java.util.Scanner;
public class StarSignPart2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size of the square you want to print: ");
        int size = Integer.valueOf(reader.nextLine());
        printSquare(size);
        reader.close();
    }

    public static void printStars(int size) {
        System.out.println("*".repeat(size));
    }

    public static void printSquare(int size) {
        for(int i = 0; i < size; i++) {
            printStars(size);
        }
    }
}
