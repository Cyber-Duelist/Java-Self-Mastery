package Helsinki.moocifi;

public class AgentOOP {
    private String firstName;
    private String lastName;

    //Constructor
    public AgentOOP(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //to-string method returns the string representation
    public String toString() {
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }


    //Main method to texr
    public static void main(String[] args) {
        AgentOOP bond = new AgentOOP("James", "Bond");
        System.out.println(bond);

        AgentOOP sublime = new AgentOOP("Entity", "Sublime");
        System.out.println(sublime);
     }
}
