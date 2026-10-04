/*Implement a program, which calculates the sum 1+2+3+...+n 
where n is given as user input. */

package Helsinki.moocifi;
import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Last number: ");
        int last = Integer.valueOf(reader.nextLine());
        int sum = 0;
        for (int i = 1; i<=last; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is "+ sum);
        reader.close();
    }

    
}