package Helsinki.moocifi;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(reader.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(reader.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.valueOf(reader.nextLine());

        int sumOfTwo = first + second;
        System.out.println("The sum of " + first + " and " + second + " is " + sumOfTwo);

        int sumOfThree = first + second + third;
        System.out.println("The sum of the three numbers is: " + sumOfThree);

        reader.close();
    }
}



