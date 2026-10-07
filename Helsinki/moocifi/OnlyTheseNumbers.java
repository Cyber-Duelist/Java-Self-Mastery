// program to ask for a start and end indices once it has finished asking for numbers. After this the program shall prints all the numbers in the list that fall in the specified range (between the indices given by the user, inclusive). You may assume that the user gives indices that match some n


package Helsinki.moocifi;
import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (to end type -1): ");
        while (true) {
            int input = Integer.valueOf(reader.nextLine());
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("From where?: ");
        int start = Integer.valueOf(reader.nextLine());
        System.out.println("To where?: ");
        int end = Integer.valueOf(reader.nextLine());

        // Safety check
        if (start < 0) start = 0;
        if (end >= numbers.size()) end = numbers.size() - 1;

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }

        reader.close();
    }
}
