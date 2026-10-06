// Reading strings from the user and printing the numberof strings entered  by the user.
package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;
public class ListSize {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter the word (empty to stop): ");

        while (true) {
            String input = reader.nextLine();

            if (input.isEmpty()) {
                break;
            }
            words.add(input);
        }
        System.out.println("In total: " + words.size());
        reader.close();

    }
}
