package Helsinki.moocifi;
import java.util.Scanner;
public class Story {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("I will tell you a story first, but i need some information first.");
        System.out.println("What is the main character called? ");
        String name = reader.nextLine();

        System.out.println("What is their job? ");
        String job = reader.nextLine();

        System.out.println("Here is the story: ");
        System.out.println("Once upon a time there was " + name + ",who was a " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be a builder forever.");

        reader.close();
    }
}
