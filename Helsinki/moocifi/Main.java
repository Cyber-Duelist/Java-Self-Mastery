package Helsinki.moocifi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Asking user for opening balance
        System.out.println("Enter opening balance: ");
        double openingBalance = reader.nextDouble();

        // Createing account with user provided balance
        Account account = new Account(openingBalance);

        // Asking user for deposit amount
        System.out.println("Enter deposit amount: ");
        double depositAmmount = reader.nextDouble();

        // Depositing into account
        account.deposit(depositAmmount);

        // Prnting final balance
        System.out.println("Final balance: " + account.balance());
        reader.close();

    }
}
// This main function is the part of First Account excercise of intro to OOP Part 4
