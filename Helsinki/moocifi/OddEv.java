package Helsinki.moocifi;
import java.util.Scanner;

public class OddEv{
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number : ");
        int num = Integer.valueOf(reader.nextLine());

        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even." );
        } else {
            System.out.println("Number " + num + " is odd.");
        }

        reader. close();
    }
}
