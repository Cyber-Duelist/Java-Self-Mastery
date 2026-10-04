package Helsinki.moocifi;
import java.util.Scanner;
public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(reader.nextLine());

            if (num==0) {
                
                count++;
                break;
            } else {
                
                count++;
                

            }
        }
        System.out.println("Number of numbers: " + count);
        reader.close();

    }

}
