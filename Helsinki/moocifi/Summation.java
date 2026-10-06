package Helsinki.moocifi;
import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Num 1: ");
        int num1 = Integer.valueOf(reader.nextLine());
        System.out.println("Num2: ");
        int num2 = Integer.valueOf(reader.nextLine());
        System.out.println("Num 3: ");
        int num3 = Integer.valueOf(reader.nextLine());
        System.out.println("Num 4: ");
        int num4 = Integer.valueOf(reader.nextLine());

        int answer = sum(num1,num2,num3,num4);
        System.out.println("Summation: " + answer);

        reader.close();
    }

    public static int sum(int num1,int num2,int num3,int num4) {
        int summation = num1 + num2 + num3 + num4;
        return summation;
    }
}
