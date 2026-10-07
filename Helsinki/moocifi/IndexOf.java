package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;
public class IndexOf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> Numbers = new ArrayList<>();
        System.out.println("Enter the numbers (-1 to exit): ");
        while (true) {
            int input = Integer.valueOf(reader.nextLine());
            if (input == -1){
                break;
            }
            Numbers.add(input);
        }
        System.out.println("Search for?: ");
        int searchNumber = Integer.valueOf(reader.nextLine());
        for ( int i = 0 ; i < Numbers.size(); i++) {
            if (Numbers.get(i) == searchNumber) {
                System.out.println(searchNumber + " is at index" + i);
            }
        }
        reader.close();

    }
    
}
