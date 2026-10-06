package Helsinki.moocifi;
import java.util.Scanner;

public class StarSignPart1 {
    public static void main(String[] args) {
        System.out.println(printStars());
        
    }

    public static String printStars() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = Integer.valueOf(reader.nextLine());
        String pattern = "*".repeat(num);
        reader.close();
        

        // using for loop
        /*String pattern = "";
        for (int i = 0; i<num;i++) {
            pattern+="*";
        }*/

        return pattern;


    }
}
