import java.math.BigInteger;
import java.util.Scanner;

public class TheEternalImmortality {

    public  static BigInteger factorial1(double n){
        if (n==0){
            return new BigInteger("1");
        }
        int i;
        BigInteger bi1 = new BigInteger("1");
        for(i=1;i<=n;i++){
            bi1=bi1.multiply(BigInteger.valueOf(i));
        }
        return bi1;
    }
      static BigInteger factorial(int n){
          BigInteger bi1 = new BigInteger(String.valueOf(n));
    if (n == 0)
        return new BigInteger("1");
    else
        return new BigInteger(String.valueOf((bi1.multiply(factorial(n-1)))));
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  a = scanner.nextInt();
        int b = scanner.nextInt();


        BigInteger result = factorial1(b).divide(factorial1(a));
        String ouput = result+"";
        char[] display = ouput.toCharArray();
        System.out.println(display[display.length-1]);

    }
}
