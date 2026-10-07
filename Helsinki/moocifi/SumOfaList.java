package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;
public class SumOfaList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number: ");

        while (true) {
            int input = Integer.valueOf(reader.nextLine());

            if (input == -1) {
                System.out.println("Terminated!");
                break;
                
            }
            numbers.add(input);
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
        reader.close();
    }
}
