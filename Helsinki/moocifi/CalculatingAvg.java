package Helsinki.moocifi;
import java.util.Scanner;
public class CalculatingAvg {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first = Integer.valueOf(reader.nextLine());

        System.out.println("Give the second number: ");
        int second = Integer.valueOf(reader.nextLine());

        System.out.println("Give the third number: ");
        int third = Integer.valueOf(reader.nextLine());

        double avg = (first+second+third)/(double)3;
        System.out.printf("The average is: %.2f%n" ,  avg);

        reader.close();
    }
}
