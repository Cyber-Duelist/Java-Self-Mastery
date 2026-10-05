package Helsinki.moocifi;
import java.util.Scanner;
public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number: " );
        int num = Integer.valueOf(reader.nextLine());

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
        reader.close();

    }
}
