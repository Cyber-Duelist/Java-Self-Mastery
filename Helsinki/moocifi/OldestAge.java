package Helsinki.moocifi;
import java.util.Scanner;
public class OldestAge {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter name and age (name,age): ");
        int oldest = 0;
        while (true) {
            String input = reader.nextLine();

            if (input.isEmpty()) {
                System.out.println("Terminated!");
                break;
            }
            String[] parts = input.split(",") ;
            int age = Integer.valueOf(parts[1]);

            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
        reader.close();
    }
}
