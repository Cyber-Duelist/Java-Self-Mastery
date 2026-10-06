package Helsinki.moocifi;
import java.util.Scanner;
public class StarSignPart3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the width of a rectangle: ");
        int width = Integer.valueOf(reader.nextLine());
        System.out.println("Enter the height of the rectangle: ");
        int height = Integer.valueOf(reader.nextLine());

        printRectangle(width,height);
        reader.close();
        
    }

    public static void printRectangle(int width, int height) {
        String row = "*".repeat(width);

        for (int i = 0; i < height;i++){
            System.out.println(row);
        }
    }
}
