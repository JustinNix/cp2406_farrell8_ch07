/**
 * Created by jc428352 on 1/09/17.
 */
import java.util.Scanner;
public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine()};
        for (int i = 0; i<words.length; i++){
            System.out.print(words[i].charAt(0));
        }
    }
}
