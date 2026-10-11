package Helsinki.moocifi;

public class FirstAccount {
    private double balance;

    public FirstAccount(double openingBalance) {
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

