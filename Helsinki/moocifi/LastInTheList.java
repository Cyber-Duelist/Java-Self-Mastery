package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;

public class LastInTheList {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter the string (empty enter to exit): ");

        while (true) {
            String input = reader.nextLine();

            if (input.isEmpty()) {
                break;

            } 
            list.add(input);
           
            }

            if (!list.isEmpty()) {
                String lastvalue = list.get(list.size() - 1);
                System.out.println(lastvalue);
            } else {
                System.out.println("No values were entered.");

            }
            reader.close();
    }
}