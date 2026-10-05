//Create a method called printText which prints the phrase "In a hole in the ground there lived a method" and a newline.

package Helsinki.moocifi;
import java.util.Scanner;
public class HoleInTheGround {
    public  static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        printText();
        reader.close();

    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method\n");
    }


}
