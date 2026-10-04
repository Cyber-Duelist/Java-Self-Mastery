package Helsinki.moocifi;
import java.util.Scanner;
public class RepeatBreakRemember {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give numbers: ");
        int sum = 0;
        int count = 0;
        int evens = 0;
        int odds = 0;
        double avg = 0;

        while (true) {
            int num =  Integer.valueOf(reader.nextLine());

            if (num == -1) {
                System.out.println("Thnx! bye!");
                break;
            }
            sum = sum + num;
            count+=1;
           

            if (num % 2 ==0) {
                evens++;

            } else {
                odds++;
            }
            
        }
        avg = (double) sum/count;
        System.out.println("Sum " + sum);
        System.out.println("count: " + count );
        System.out.println("Number of odds: "+ odds);
        System.out.println("Number of evens: " + evens);
        System.out.printf("Average: %.2f%n " , avg);

        reader.close();



        
    }
}
