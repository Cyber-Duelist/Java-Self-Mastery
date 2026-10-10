package Helsinki.moocifi;
import java.util.Scanner;
public class OldestName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter (name,age): ");
        int oldest = 0;
        String nameOfOldest = "";
        while (true) {
            String input = reader.nextLine();
            if (input.isEmpty()) {
                System.out.println("Terminated!");
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1].trim());

            if (age > oldest) {
                oldest = age;
                nameOfOldest = name;
            }
        }

        System.out.println("Nmae of the oldest: " + nameOfOldest);
        reader.close();
    }
}
