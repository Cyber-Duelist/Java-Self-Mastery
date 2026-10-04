package Helsinki.moocifi;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = Integer.valueOf(reader.nextLine());

        if (num < 0) {
            num*= -1;
            System.out.println(num);
        } else {
            System.out.println(num);
        }

        reader.close();
    }
}
