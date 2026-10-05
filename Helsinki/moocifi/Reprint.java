package Helsinki.moocifi;
import java.util.Scanner;
public class Reprint {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Number of times: ");
        int repeat = Integer.valueOf(reader.nextLine());

        for (int i =1; i <= repeat; i++) {
            printText();
        }
        reader.close();

        
        

    }
    

    public static void printText() {
        System.out.println("In a hole in the ground there live a method.");

    }
}
