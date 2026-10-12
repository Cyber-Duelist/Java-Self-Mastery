package Helsinki.moocifi;

class Room {
    private String code;
    private int seats;

    //constructor
    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }

    //Getters method, may be useful
    public String getCode() {
        return code;
    }
    public int getSeats() {
        return seats;
    }
    
    public String toString() {
        return "Room code: " + code + ", Seats: " + seats;
    }
}

public class RoomOOP {
    public static void main (String[] args) {
        Room r1 = new Room("A121" , 30);
        Room r2 = new Room("C403", 40);
        System.out.println(r1);
        System.out.println(r2);

        // Print using getters
        System.out.println("Room " + r1.getCode() + " has " + r1.getSeats() + " seats. ");
    }
}