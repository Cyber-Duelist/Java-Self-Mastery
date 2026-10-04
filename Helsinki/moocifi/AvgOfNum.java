package Helsinki.moocifi;
import java.util.Scanner;
public class AvgOfNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int total = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(reader.nextLine());

            if (num == 0) {
                break;
            } else{
                total ++;
                sum +=num;
                
            }
            
        }
        double avg = (double) sum/total;

        System.out.println("Average of the numbers: " + avg);
        
        reader.close();
    }
}
