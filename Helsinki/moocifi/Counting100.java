/* Write a program, which reads an integer from the user. 
Then the program prints numbers from that number to 100. 
You can assume that the user always gives a number less than 100.*/

package Helsinki.moocifi;
import java.util.Scanner;
public class Counting100 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int start = Integer.valueOf(reader.nextLine());

        for (int i = start; i <= 100; i++ ) {
            System.out.println(i);
        }

        reader.close();


    }
}
