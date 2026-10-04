// Write a program, according to the preceding example, that asks the user to input values until they input the value 4.

package Helsinki.moocifi;
import java.util.Scanner;

public class AreWeThere {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.println("Give a number: ");
            int num = Integer.valueOf(reader.nextLine());
            
            if (num == 4) {
                System.out.println("We have reached!");
                break;
            }

        } 

        reader.close();

        
        
    }
}
