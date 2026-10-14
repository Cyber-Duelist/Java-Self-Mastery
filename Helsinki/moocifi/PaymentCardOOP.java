package Helsinki.moocifi;

// PaymentCardOOP.java
class PaymentCard {
    private double balance;

    // Constructor
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    // Eat affordably: costs 2.60
    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    // Eat heartily: costs 4.60
    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    // Add money (cannot exceed 150, cannot add negative)
    public void addMoney(double amount) {
        if (amount < 0) {
            return; // ignore negative top-ups
        }
        this.balance += amount;
        if (this.balance > 150.0) {
            this.balance = 150.0;
        }
    }

    // String representation
    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}

public class PaymentCardOOP {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // Paul eats heartily
        paulsCard.eatHeartily();
        // Matt eats affordably
        mattsCard.eatAffordably();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul tops up 20 euros
        paulsCard.addMoney(20);
        // Matt eats heartily
        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul eats affordably twice
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        // Matt tops up 50 euros
        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
