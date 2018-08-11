import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.nextLine();
        scanner.close();
        int output= 0;
        if (n < 6){
            System.out.println(6 - n);
            System.exit(0);
        }
        boolean upperCase = !s.equals(s.toLowerCase()); //check if the input has a lower case letter
        boolean lowerCase = !s.equals(s.toUpperCase()); //check if the input has a CAPITAL case letter
        boolean hasSpecial = !s.matches("[A-Za-z0-9]*"); // check if the input has a special characters
        boolean hasNumber = !s.matches(".*\\d+.*");  //check if the input contains a digit
        if (upperCase)
            output++;
        if (lowerCase)
            output++;
        if (hasNumber)
            output++;
        if (hasSpecial)
            output++;
        if (!upperCase && !lowerCase && !hasNumber && !hasSpecial){
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(output);
    }
}
