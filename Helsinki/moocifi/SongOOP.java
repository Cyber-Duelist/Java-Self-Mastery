package Helsinki.moocifi;

public class SongOOP {
    private String name;
    private int length;

    //Constructor
    public SongOOP(String name, int length) {
        this.name = name;
        this.length = length;
    }

    //Method returning the name
    public String name() {
        return this.name;
    }

    //Method returning the length
    public int length(){
        return this.length;
    }

    //Main method
    public static void main(String[] args) {
        SongOOP track1 = new SongOOP("Imagine " , 105);
        SongOOP track2 = new SongOOP("Dont play dumb", 120);

        System.out.println("Song: " + track1.name() + ", length: " + track1.length()+ " seconds.");
        System.out.println("Song: " + track2.name() + ", length: " + track2.length()+ " seconds.");
    } 
}
