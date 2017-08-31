/**
 * Created by jc428352 on 1/09/17.
 */
import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split("\\s+|!");
        System.out.println(words.length);

    }
}
//fix