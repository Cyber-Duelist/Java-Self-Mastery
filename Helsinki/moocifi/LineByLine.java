package Helsinki.moocifi;
import java.util.Scanner;
public class LineByLine {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter sentence: ");

        while (true) {
            String input = reader.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(" ");
            for (String part: parts) {
                System.out.println(part);
            }
        }
        reader.close();
    }
}
