import java.math.BigInteger;
import java.util.Scanner;

public class MathChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i=0;i<t;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int result = 1;
            for (int j=c+1;j<b+1;j++){
                result *= j;
            }
            System.out.println(result);
        }
    }
}
