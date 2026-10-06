// program to print both the first and the last values after reading ends.
package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter the string (empty to stop): ");

        while (true) {
            String input = reader.nextLine();

            if (input.isEmpty()) {
                break;
            }
            list.add(input);

        }

        if (list.size() >=2) {
            String firstvalue = list.get(0);
            String lastvalue = list.get(list.size()-1);
            System.out.println(firstvalue);
            System.out.println(lastvalue);

        } else {
            System.out.println("Pleaswe enter at least 2 strings.");
        }

        reader.close();
    }

    
}
