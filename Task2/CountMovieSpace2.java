/**
 * Created by jc428352 on 1/09/17.
 */
import java.util.Scanner;
public class CountMovieSpace2 {
    public static void main(String[] args) {
        int count = 0;
        String userQuote;
        Scanner input = new Scanner(System.in);
        userQuote = input.nextLine();
        for(char c: userQuote.toCharArray()){
            if(c == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
