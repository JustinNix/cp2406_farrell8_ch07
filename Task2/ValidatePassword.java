/**
 * Created by jc428352 on 1/09/17.
 */
import java.util.Scanner;
public class ValidatePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        int upperCaseCount = 0, lowerCaseCount = 0, digitCount = 0;
        System.out.println("Please enter a password with 2 uppercase letters, 2 lowercase and at least 2 digits plz");
        while(upperCaseCount < 2 || lowerCaseCount <2 || digitCount < 2) {
            upperCaseCount = 0;
            lowerCaseCount = 0;
            digitCount = 0;
            password = input.nextLine();
            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lowerCaseCount++;
                } else if (Character.isUpperCase(c)) {
                    upperCaseCount++;
                } else if (Character.isDigit(c)) {
                    digitCount++;
                }
            }
        }
    }
}
