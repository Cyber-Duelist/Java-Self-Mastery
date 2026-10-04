package Helsinki.moocifi;
import java.util.Scanner;
public class DifferentInputs {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String val1 = reader.nextLine();

        System.out.println("Give an integer:");
        int val2 = Integer.valueOf(reader.nextLine());

        System.out.println("Give a double:");
        double val3 = Double.valueOf(reader.nextLine());
        
        System.out.println("Give a boolean:");
        boolean val4 = Boolean.valueOf(reader.nextLine());

        System.out.println("You gave the string " + val1);
        System.out.println("You gave the integer " + val2);
        System.out.println("You gave the double " + val3);
        System.out.println("You gave the boolean " + val4);
        
        reader.close();

    }
}
