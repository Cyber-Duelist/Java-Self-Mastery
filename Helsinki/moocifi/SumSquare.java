package Helsinki.moocifi;
import java.util.Scanner;
public class SumSquare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = Integer.valueOf(reader.nextLine());

        System.out.println("Enter second number: ");
        int second = Integer.valueOf(reader.nextLine());
        int sum = first + second;
        double sqrSum = Math.sqrt(sum);

        System.out.printf("%.2f%n", sqrSum);

        reader.close();


    }
}
