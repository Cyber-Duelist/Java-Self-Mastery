package Helsinki.moocifi;
import java.util.Scanner;
public class Averaging {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Number 1: ");
        int num1 = Integer.valueOf(reader.nextLine());
        System.out.println("Number 2: ");
        int num2 = Integer.valueOf(reader.nextLine());
        System.out.println("Number 3: ");
        int num3 = Integer.valueOf(reader.nextLine());

        double avg = (double) avgof(num1,num2,num3);
        System.out.printf("Average: %.3f%n " , avg);
        reader.close();   
    }

    public static double avgof(int num1, int num2, int num3) {
        return  (double)(num1+num2+num3)/3;

    }
}
