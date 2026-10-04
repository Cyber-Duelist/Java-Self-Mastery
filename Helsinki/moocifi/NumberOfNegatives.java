package Helsinki.moocifi;
import java.util.Scanner;
public class NumberOfNegatives {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int countNeg = 0;
        int countPos = 0;

        while (true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(reader.nextLine());
            if (num == 0) {
                break;
            } else if (num < 0) {
                countNeg++;
                
                continue; 
            } else {
                countPos++;
            }
        }

        System.out.println("Number of negatives:" + countNeg);
         System.out.println("Number of positives:" + countPos);
        

        reader.close();
    } 
}
