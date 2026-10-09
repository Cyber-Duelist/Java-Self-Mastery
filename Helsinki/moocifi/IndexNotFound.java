package Helsinki.moocifi;
import java.util.Scanner;
public class IndexNotFound {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Asking user of aray size
        System.out.println("Enter the size of an array: ");
        int size = Integer.valueOf(reader.nextLine());

        int[] numbers = new int[size];

        // Filling the array with the user of the user input.
        System.out.println("Enter" + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.valueOf(reader.nextLine());
        }
        System.out.println("Search for?: ");
        int search = Integer.valueOf(reader.nextLine());


        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println(search + " is at index " + i + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(search + " was not found.");
        }
        reader.close();
    }
}
