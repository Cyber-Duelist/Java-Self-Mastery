package Helsinki.moocifi;

public class WhistleOOP {
    private String sound;

    //constructor
    public WhistleOOP(String whistleSound) {
        this.sound = whistleSound;
    }

    //Printing the sound method
    public void sound() {
        System.out.println(this.sound);
    }

    //Main method for testing
    public static void main(String[] args) {
        WhistleOOP duckWhistle = new WhistleOOP("kwaak kwaak");
        WhistleOOP roosterWhistle = new WhistleOOP("Peef peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        roosterWhistle.sound();
    }
}