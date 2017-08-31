/**
 * Created by jc428352 on 1/09/17.
 */
import java.util.Scanner;
public class Alphabetize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] words = new String[3];
        words[0] = input.nextLine();
        words[1] = input.nextLine();
        words[2] = input.nextLine();
        for (int i = 0; i < words.length; i++){
            int count = 0;
            for (char c: words[i].toCharArray()){
                if(c == alphabet.charAt(count)) {
                    count++;
                    if(count == words[i].length()){
                        System.out.println(words[i]);
                    }
                }
            }
            System.out.println();
        }
    }
}

//whoops did this wrong