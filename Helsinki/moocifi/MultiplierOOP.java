package Helsinki.moocifi;

public class MultiplierOOP {
    private int number; //instance variable

    //Constructor
    public MultiplierOOP(int number) {
        this.number = number;
    }

    //Multiply method
    public int multiply(int number) {
        return this.number * number;
    }

    //Main method to text
    public static void main(String[] args) {
        MultiplierOOP multiplyByThree = new MultiplierOOP(3);
        System.out.println("multiplyby3.multiply(2):  " + multiplyByThree.multiply(2));
        MultiplierOOP multiplyByFour = new MultiplierOOP(4);
        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
    }

    
}
