// its a program to sum the second and third elelement in the list
package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;
public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // below code will read integers and add it to list.
        while (true) {
            int number = Integer.valueOf(reader.nextLine());
            
            // reading/accepting input is stopped once the user entered 0.
            if (number == 0){
                break;
            }
            numbers.add(number);
        }
        
        System.out.println("Sum is: " + (numbers.get(1) + numbers.get(2)));
        reader.close();

    }
    
    
}
