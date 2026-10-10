package Helsinki.moocifi;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = reader.nextLine();
        System.out.println("Enter the password: ");
        String password = reader.nextLine();

        if (username.equals("alex") && password.equals("sunshine")) {
            System.out.println("You have now logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

        reader.close();
    }    
    
}
