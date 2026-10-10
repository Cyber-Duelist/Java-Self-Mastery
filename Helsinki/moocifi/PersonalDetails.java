package Helsinki.moocifi;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = reader.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            int birthYear = Integer.valueOf(parts[1].trim());

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            sum+=birthYear;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + average);

        reader.close();

    }
}
