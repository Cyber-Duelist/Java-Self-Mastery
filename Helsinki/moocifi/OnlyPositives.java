package Helsinki.moocifi;
import java.util.Scanner;
public class OnlyPositives {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(reader.nextLine());

            if (num < 0){
                System.out.println("Unsuitable number");
                continue;

            } else if (num == 0) {
                System.out.println("Goodbye.");
                break;
            } else {
                num = (int) Math.pow(num ,2);
                System.out.println( num);
                continue;
            }  
        }
        reader.close();

        
        
       

        

    }
}
