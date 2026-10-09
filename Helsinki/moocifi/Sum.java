package Helsinki.moocifi;
import java.util.Scanner;
import java.util.ArrayList;
public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers, type -1 to finish! : ");
        
        while (true) {
            int input = Integer.valueOf(reader.nextLine());
            if (input == -1) {
                break;

            }
            numbers.add(input); 
            
        }
    }
    
}
