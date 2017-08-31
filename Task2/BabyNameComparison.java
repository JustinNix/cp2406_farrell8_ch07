/**
 * Created by jc428352 on 25/08/17.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String>babyNames=new ArrayList<>();
        for (int i = 0; i<3 ; i++) {
            System.out.println("Enter baby name: ");
            babyNames.add(input.nextLine());
        }
        for (int i = 0; i<babyNames.size(); i++) {
            for (int j = 0; j < babyNames.size(); j++) {
                System.out.println(babyNames.get(i) + " " + babyNames.get(j));
            }
        }
    }
}
