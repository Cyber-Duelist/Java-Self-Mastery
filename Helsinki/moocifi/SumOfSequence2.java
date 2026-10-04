package Helsinki.moocifi;
import java.util.Scanner;

public class SumOfSequence2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First number?: ");
        int first = Integer.valueOf(reader.nextLine());

        System.out.println("Last number?: ");
        int last = Integer.valueOf(reader.nextLine());
        int sum = 0;
        for (int i = first; i<=last; i++) {
            sum+=i;
        }

        System.out.println("The sum is " + sum);

        reader.close();
    }
} 