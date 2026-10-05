package Helsinki.moocifi;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        division();
    }

    public static void division() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = Integer.valueOf(reader.nextLine());
        System.out.println("Enter the second number: ");
        int num2 = Integer.valueOf(reader.nextLine());

        double divide = (double) num1/num2 ;
        
        System.out.println(divide);

        reader.close();
    }


}
