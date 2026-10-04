package Helsinki.moocifi;
import java.util.Scanner;
public class GiftTax {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Value of the gift?: ");
        double gift = Double.valueOf(reader.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift < 6000) {
            double tax = 100 + (gift-5000)*0.08;
            System.out.println("Tax: " + tax);
        } else if (gift < 55_000) {
            double tax = 180 + (gift - 6000) * 0.1;
            System.out.println("Tax: " + tax);
        } else {
            double tax = 4700 + (gift - 55_000)*0.12;
            System.out.println("Tax: " + tax);
        }

        reader.close();



    }
}
