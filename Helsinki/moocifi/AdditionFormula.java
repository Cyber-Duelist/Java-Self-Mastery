package Helsinki.moocifi;
import java.util.Scanner;

public class AdditionFormula{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int firstNum = Integer.valueOf(reader.nextLine());

        System.out.println("Give the second number: ");
        int secondNum = Integer.valueOf(reader.nextLine());

        int sum = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum +  " = " + sum);

        reader.close();

    }

}

// Multiplication and division also has the same concept but with different signs :-)