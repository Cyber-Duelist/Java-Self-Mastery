//Write a method public static String word(). The method must return a string of your choice.

package Helsinki.moocifi;
import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        System.out.println(word());

    }

    public static String word() {
        Scanner reader = new Scanner(System.in);
        String wish = String.valueOf(reader.nextLine());
        reader.close();

        return wish;

        

    }
    
    
}
