package Helsinki.moocifi;
import java.util.Scanner;

public class Divisibleby3 {
    public static void main(String[] args) {
        divisibleByThree();

    }

    public static void divisibleByThree() {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter beggining of range: ");
        int beggining = Integer.valueOf(reader.nextLine());

        System.out.println("Enter last/end of range: ");
        int end = Integer.valueOf(reader.nextLine());

        int start = Math.min(end, beggining);
        int finish = Math.max(end, beggining);

        for (int i = start; i<=finish; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        reader.close();


    }
}