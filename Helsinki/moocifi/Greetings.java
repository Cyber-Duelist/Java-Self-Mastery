package Helsinki.moocifi;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?:  ");

        String greet = reader.nextLine();
        System.out.println("Hi " + greet);
        reader.close();
    }
    
}

