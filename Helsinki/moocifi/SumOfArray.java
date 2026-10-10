package Helsinki.moocifi;
import java.util.Scanner;

public class SumOfArray {
    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int num : array) {   // enhanced for-loop
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Step 1: Ask for size
        System.out.print("Enter the size of the array: ");
        int size = Integer.valueOf(reader.nextLine());

        // Step 2: Create array
        int[] numbers = new int[size];

        // Step 3: Fill array with user input
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.valueOf(reader.nextLine());
        }

        // Step 4: Compute sum
        int result = sumOfNumbersInArray(numbers);
        System.out.println("Sum of array = " + result);

        reader.close();
    }
}
