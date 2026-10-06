//Printing the third value entered/added by the user in the list.
package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;
public class ThirdElement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        //Reading inputs and adding into list.
        while (true) {
            String input = reader.nextLine();

            // Stop reading if user enters an empty string.
            if (input.isEmpty()) {
                break;
            }

            list.add(input);
        }

        // printing the thrird element from the list.
        System.out.println(list.get(2));




    }
}
