package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;
public class GreatestInList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> Numbers = new ArrayList<>();
        System.out.println("Enter numbers (-1 to exit): ");

        while (true) {
            int input = Integer.valueOf(reader.nextLine());
            if ( input == -1) {
                break;
            }
            Numbers.add(input);
        }
        int greatest = Numbers.get(0);
        for (int i = 0; i < Numbers.size();i++) {
            int number = Numbers.get(i);

            if (number > greatest) {
                greatest = number;
            }
        }
        System.out.println("Greatest number: " + greatest);
        reader.close();



    }
    
}
