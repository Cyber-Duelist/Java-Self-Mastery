package Helsinki.moocifi;
import  java.util.Scanner;
public class FromWhere2Where1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Where to?: ");
        int where = Integer.valueOf(reader.nextLine());

        for (int i =1; i<=where; i++) {
            System.out.println(i);
        }

        reader.close();



    }
}

