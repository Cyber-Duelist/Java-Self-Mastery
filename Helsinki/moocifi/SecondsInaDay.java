package Helsinki.moocifi;
import java.util.Scanner;
public class SecondsInaDay {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(reader.nextLine());
        int seconds = days * 86_400;

        System.out.println(seconds);

        reader.close();


    }

}
