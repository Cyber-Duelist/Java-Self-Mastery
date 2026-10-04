package Helsinki.moocifi;
import java.util.Scanner;

public class DoubleInput{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number: ");
        double value = Double.valueOf(reader.nextLine());

        System.out.println("You wrote " + value);


    }
}