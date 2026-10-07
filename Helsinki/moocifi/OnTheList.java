package Helsinki.moocifi;
import java.util.Scanner;
import java.util.ArrayList;

public class OnTheList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter the names (empty to end): ");

        while (true) {
            String name = reader.nextLine();  // use nextLine here
            if (name.isEmpty()) {
                System.out.println("Exiting program!");
                break;
            }
            names.add(name);
        }

        System.out.println("Search for?: ");
        String search = reader.nextLine();

        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }

        reader.close();
    }
}
