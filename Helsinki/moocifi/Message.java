// WAP that asks user to write a message  and the program will print it.
package Helsinki.moocifi;

import java.util.Scanner;

public class Message{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message: ");

        String message = scanner.nextLine();
        System.out.println(message);

        scanner.close();


    }
}