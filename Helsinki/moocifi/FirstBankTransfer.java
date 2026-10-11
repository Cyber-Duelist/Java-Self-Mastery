package Helsinki.moocifi;
import java.util.Scanner;

public class FirstBankTransfer {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Creating Matthews account
        System.out.print("Enter the opening balance for Matthews account: ");
        double matthewsBalance = reader.nextDouble();
        Account matthewsAccount = new Account("Matthews account", matthewsBalance);

        // Create My account
        System.out.print("Enter opening balance for My account: ");
        double myBalance = reader.nextDouble();
        Account myAccount = new Account("My account", myBalance);

        // Withdraw from Matthews account
        System.out.print("Enter amount to withdraw from Matthews account: ");
        double withdrawAmount = reader.nextDouble();
        matthewsAccount.withdraw(withdrawAmount);

        // Deposit into My account
        System.out.print("Enter amount to deposit into My account: ");
        double depositAmount = reader.nextDouble();
        myAccount.deposit(depositAmount);

        // Printing both accounts
        System.out.println(matthewsAccount);
        System.out.println(myAccount);

        reader.close();
    }
}

// Helper class — not public
class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return name + " balance: " + balance;
    }
}

