package Helsinki.moocifi;
import java.util.Scanner;
import java.util.ArrayList;
public class ArraySwap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers = {1,2,3,5,8,6};
        for (int i = 0 ; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\n Give two indices to swap: ");
        int index1 = Integer.valueOf(reader.nextLine());
        int index2 = Integer.valueOf(reader.nextLine());

        // Performing Swap
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
        
        // Print array again
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        reader.close();

    } 
    
}
