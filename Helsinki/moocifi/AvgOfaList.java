package Helsinki.moocifi;
import java.util.Scanner;
import java.util.ArrayList;


public class AvgOfaList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the numbers (-1 to exit): ");

        while (true) {
            int input = Integer.valueOf(reader.nextLine());
            if ( input == -1) {
                System.out.println("Terminated!");
                break;
            }

            numbers.add(input);
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double avg = 1.0 * sum / numbers.size();
        System.out.println("Average: " + avg);
        reader.close();

    }


    
}
