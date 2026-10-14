package Helsinki.moocifi;

public class DebtOOP {
    private  double balance;
    private double interestRate;

    //constructor
    public DebtOOP(double initialBalance, double initialInterestRate) {
        this.balance =  initialBalance;
        this.interestRate =initialInterestRate;
    }

    //Printing to current balance
    public void printBalance() {
        System.out.println(this.balance);
    }

    //Increasing the debt by multiplying balance with interest rate
    public void waitOneYear() {
        this.balance *= this.interestRate;
    }
    //Main program to teast
    public static void main(String[] args) {
        DebtOOP mortgage = new DebtOOP(120000.0,1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0 ;

        while (years < 20) {
            mortgage.waitOneYear();
            years += 2;
        }
        mortgage.printBalance();
    }

    
}
