package Helsinki.moocifi;
import java.util.Scanner;

public class AVclub {
public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter string: ");

    while (true) {
        String input = reader.nextLine();
        if (input.isEmpty()) {
            System.out.println("Terminating!");
            break;
        }
        String[] parts = input.split(" ");
        for (String part : parts) {
            if (part.contains("av")) {
                System.out.println(part);
            }
        }
    }
    reader.close();
}    
}
