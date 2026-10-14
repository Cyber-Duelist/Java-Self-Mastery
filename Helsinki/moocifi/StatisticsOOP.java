package Helsinki.moocifi;
import java.util.Scanner;

class Statistics {
    private int count;
    private int sum;

    //Constructor
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    //Adda number
    public void addNumber(int number) {
        this.count++;
        this.sum+=number;
    }
    //Return count
    public int getCount() {
        return this.count;
    }

    //Return sum
    public int sum() {
        return this.sum;
    }

    //Return average
    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return (double) this.sum/this.count;
    }

}

//Main method
public class StatisticsOOP {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int num = Integer.valueOf(reader.nextLine());
            if (num == -1) {
                break;
            }

            allNumbers.addNumber(num);

            if (num % 2 == 0) {
                evenNumbers.addNumber(num);
            } else {
                oddNumbers.addNumber(num);
            }
        }

        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());

        reader.close();
    }


    
}

