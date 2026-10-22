package Helsinki.moocifi;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Items_ListObjects {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            items.add(new Item(name));
        }

        System.out.println();
        for (Item item:items) {
            System.out.println(item);
        }
    }
}

class Item {
    private String name;
    private LocalDateTime createdAt;
    
    
    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();

    } 

    public String getName() {
        return name;
    }

    @Override 
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return this.name + " (created at : " + this.createdAt.format(formatter) + ")";
    }
}
