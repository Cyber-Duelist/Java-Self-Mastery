package Helsinki.moocifi;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = Integer.valueOf(reader.nextLine());

        System.out.println("Enter the second mumber: ");
        int second = Integer.valueOf(reader.nextLine());

        int sum = first + second ;
        int multiply = first*second;
        double divide = (double) first/second;
        int subtract = first - second;

        System.out.println(first + "+" + second + "= " + sum);
        System.out.println(first + "-" + second + "=" + subtract);
        System.out.println(first + "*" + second + "=" + multiply);
        System.out.printf(first + "/" + second + "=" +  divide);
  
        reader.close();

    }
}
