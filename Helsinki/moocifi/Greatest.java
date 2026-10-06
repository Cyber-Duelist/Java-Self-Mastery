package Helsinki.moocifi;
import java.util.Scanner; 
public class Greatest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = Integer.valueOf(reader.nextLine());

        System.out.println("Enter number 2: ");
        int num2 = Integer.valueOf(reader.nextLine());

        int great = greatest(num1,num2);
        System.out.println("Greatest: " + great);
        reader.close();

    }

    public static int greatest(int num1, int num2) {
        return Math.max(num1,num2);
    }
}
