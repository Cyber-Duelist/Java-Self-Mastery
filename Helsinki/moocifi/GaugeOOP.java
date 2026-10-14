package Helsinki.moocifi;

public class GaugeOOP {
    private int value;

    //comstructor setting intial value to 0
    public GaugeOOP() {
        this.value = 0;
    }

    //Increasing the value by 1 bu less than 5
    public  void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    //Decreasing the value by 1 but not negative
    public void decrease() {
        if (this.value > 0){
            this.value--;
        }
    }

    //Returning value
    public int value() {
        return this.value;
    }

    //Return true if value is 5
    public boolean full() {
        return this.value == 5;
    }

    //Main method
    public static void main(String[] args) {
        GaugeOOP g = new GaugeOOP();

        System.out.println("Initial value: " + g.value()); // 0
        g.increase();
        g.increase();
        System.out.println("After 2 increases: " + g.value()); // 2

        g.decrease();
        System.out.println("After decrease: " + g.value()); // 1

        // Fill it up
        g.increase();
        g.increase();
        g.increase();
        g.increase(); // capped at 5
        System.out.println("Final value: " + g.value()); // 5
        System.out.println("Is full? " + g.full()); // true
    }
}

