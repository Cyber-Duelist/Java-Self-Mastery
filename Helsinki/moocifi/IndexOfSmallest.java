package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;
public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> Numbers = new ArrayList<>();
        System.out.println("Enter the number (9999 to exit): ");
        while (true) {
            int input = Integer.valueOf(reader.nextLine());
            if (input == 9999) {
                System.out.println("Terminating!");
                break;
            }
            Numbers.add(input);
        }
        
        int smallest = Numbers.get(0);
        for (int i = 0; i < Numbers.size(); i++) {
            if (Numbers.get(i)< smallest){
                smallest = Numbers.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < Numbers.size(); i++){
            if (Numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }

        reader.close();
    }
}
