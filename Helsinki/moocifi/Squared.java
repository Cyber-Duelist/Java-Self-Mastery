package Helsinki.moocifi;
import java.util.Scanner;

public class Squared{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int num = Integer.valueOf(reader.nextLine());

        int square = num*num;
        System.out.println(square);

        reader.close();
        
        
    } 
}