package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the numbers (-1 to exit):");
        while (true) {
            int num = Integer.valueOf(reader.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }
        System.out.println("Print the numbers between: \nFirst number: ");
        int lower = Integer.valueOf(reader.nextLine());
        System.out.println("Last number: ");
        int upper = Integer.valueOf(reader.nextLine());

        for (int number:numbers) {
            if (number >= lower && number <= upper) {
                System.out.println(number);
            }
        }
        reader.close();

    }
    
}
