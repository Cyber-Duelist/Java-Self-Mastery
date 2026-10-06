package Helsinki.moocifi;
import java.util.Scanner;

public class Smallest {
    public  static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter number1: ");
        int num1 = Integer.valueOf(reader.nextLine());

        System.out.println("Enter number2: ");
        int num2 = Integer.valueOf(reader.nextLine());

        int answer = smallest(num1,num2);
        System.out.println("Smallest: " + answer);
        reader.close();
    }

    public static int smallest(int num1, int num2) {
        return Math.min(num1, num2);
        
    }
}
