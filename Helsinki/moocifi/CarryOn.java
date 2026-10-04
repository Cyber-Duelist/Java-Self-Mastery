//Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".
package Helsinki.moocifi;

import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        
        while (true) {
            System.out.println("Shall we carry on ?: ");
            String response = String.valueOf(reader.nextLine());
            if (response.equals("no")) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println("Lets carry on!");
        }
        reader.close();
        


    }
}
