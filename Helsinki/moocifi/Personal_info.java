package Helsinki.moocifi;

import java.util.ArrayList;
import java.util.Scanner;

// Main public class matching the filename Personal_info.java
public class Personal_info {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            // Exit loop if first name is empty
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();

            // Create and add PersonalInformation object
            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        System.out.println();

        // Print first and last names of each person
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

        scanner.close();
    }
}

// Non-public helper class representing a person's information
class PersonalInformation {

    private String firstName;
    private String lastName;
    private String identificationNumber;

    public PersonalInformation(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }
}