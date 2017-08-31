/**
 * Created by jc428352 on 1/09/17.
 */
public class CountMovieSpaces {
    public static void main(String[] args) {
        int count = 0;
        String quote = "Theres a snake in my boot";
        for(char c: quote.toCharArray()){
            if(c == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
