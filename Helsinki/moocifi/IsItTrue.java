package Helsinki.moocifi;
import java.util.Scanner;
public class IsItTrue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a string: ");
        String string = reader.nextLine();

        if (string.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
        reader.close();
    }
}
    
