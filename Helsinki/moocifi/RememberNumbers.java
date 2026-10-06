//A program that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.
package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;
public class RememberNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> Numbers = new ArrayList<>();

        System.out.println("Enter the numbers (-1 to exit the program): ");

        while (true) {
            int input = Integer.valueOf(reader.nextLine());

            if (input == -1) {
                break;
            }
            Numbers.add(input);


        }
        System.out.println("The numbers you entered: ");
        for (int i = 0; i < Numbers.size(); i++) {
            System.out.println(Numbers.get(i));
        }

        reader.close();
    }
}
