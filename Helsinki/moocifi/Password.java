// Write a program that prompts the user for a password. If the password is "Caput Draconis" the program prints "Welcome!". Otherwise, the program prints "Off with you!"

package Helsinki.moocifi;
import java.util.Scanner;

public class Password{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter password: ");
        String passwd = String.valueOf(reader.nextLine());

        if (passwd.equals("Caput Draconis")) {
            System.out.println("Welcom!");
        } else {
            System.out.println("Off with you!");
        }

        reader.close();
    }
}