/* Write a program that reads an integer from the user. 
Next, the program prints numbers from 0 to the number given by the user. 
You can assume that the user always gives a positive number.*/

package Helsinki.moocifi;
import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give number: ");
        int num = Integer.valueOf(reader.nextLine());

        for (int i = 0; i<=num; i++) {
            System.out.println(i);
        }
        reader.close();

    }
}
