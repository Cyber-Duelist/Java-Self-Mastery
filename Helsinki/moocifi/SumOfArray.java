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

        
        System.out.print("Enter the size of the array: ");
        int size = Integer.valueOf(reader.nextLine());

        
        int[] numbers = new int[size];

        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.valueOf(reader.nextLine());
        }

        
        int result = sumOfNumbersInArray(numbers);
        System.out.println("Sum of array = " + result);

        reader.close();
    }
}
