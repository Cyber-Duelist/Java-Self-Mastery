// Write a program that gives a course grade according to the provided table.
package Helsinki.moocifi;
import java.util.Scanner;

public class GradesPoints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give points [0-100]: ");
        int points = Integer.valueOf(reader.nextLine());

        if (points > 100) {
            System.out.println("Grade: incredible!");
        } else if (points > 90) {
            System.out.println("Grade: 5");
        } else if (points > 80) {
            System.out.println("Grade: 4");
        } else if (points > 70) {
            System.out.println("Grade: 3");
        } else if (points > 60) {
            System.out.println("Grade: 2");
        } else if (points > 50) {
            System.out.println("Grade: 1");
        } else if (points > 0) {
            System.out.println("Grade: Failed");
        } else {
            System.out.println("Grade: impossible!");
        }

        reader.close();

    }
    
}
