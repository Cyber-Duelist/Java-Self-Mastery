package Helsinki.moocifi;

public class Account {
    private double balance;

    public Account(double openingBalance) {
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public double balance() {
        return this.balance;
    }
}

