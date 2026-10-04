package Helsinki.moocifi;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?:  ");

        String greet = scanner.nextLine();
        System.out.println("Hi " + greet);
    }
}

