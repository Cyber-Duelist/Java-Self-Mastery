package Helsinki.moocifi;
import java.util.Scanner;

public class BooleanInput{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write something: ");
        boolean value = Boolean.valueOf(reader.nextLine());

        System.out.println("True or false? "); 
        System.out.println(value);

        reader.close();

    }
}