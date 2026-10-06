// Here I will print a traiangle patterm.

package Helsinki.moocifi;
import java.util.Scanner;
public class StarSignPart4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size of the triangle: ");
        int size = Integer.valueOf(reader.nextLine());

        printTriangle(size);
        reader.close();
    }
    public static void printTriangle(int size) {
        for (int i = 0; i <= size; i++) {
            System.out.println("*".repeat(i));
        }
    }
    
}
