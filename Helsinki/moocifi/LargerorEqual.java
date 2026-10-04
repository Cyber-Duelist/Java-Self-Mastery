//Write a program that prompts the user for two integers and prints the larger of the two. If the numbers are the same, then the program informs us about this as well.

package Helsinki.moocifi;
import java.util.Scanner;

public class LargerorEqual {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int firstnum = Integer.valueOf(reader.nextLine());

        System.out.println("Give the second nuber: ");
        int secondnum = Integer.valueOf(reader.nextLine());

        if (firstnum > secondnum) {
            System.out.println("Gretaer number is " +  firstnum);
        } else if (firstnum < secondnum) {
            System.out.println("Greater number is " + secondnum);
        } else {
            System.out.println("The numbers are equal!");
        }

        reader.close();
     }
    
}
