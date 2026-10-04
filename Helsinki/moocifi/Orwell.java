package Helsinki.moocifi;
import java.util.Scanner;
public class Orwell {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int value = Integer.valueOf(reader.nextLine());

        if (value==1984) {
            System.out.println("Orwell");
        }

        reader.close();
     

    }
}
