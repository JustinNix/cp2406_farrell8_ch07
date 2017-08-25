/**
 * Created by jc428352 on 25/08/17.
 */
import java.util.Scanner;
public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter baby name: ");
        String name1 = input.nextLine();
        System.out.println("Enter baby name: ");
        String name2 = input.nextLine();
        System.out.println("Enter baby name: ");
        String name3 = input.nextLine();
        System.out.println(name1.concat(" " + name2));
        System.out.println(name1.concat(" " + name3));
        System.out.println(name2.concat(" " + name3));
    }
}
