import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HighwayConstruction {
    static int highwayConstruction(long n, int k) {
        // Complete this function
        double result = 0.0;
        int range = (int) n;
        for(int i = range-1; i > 1; i -- ){
            result += Math.pow(n-1, k);
            n--;
            range--;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long n = in.nextLong();
            int k = in.nextInt();
            int result = highwayConstruction(n, k);
            System.out.println(result);
        }
        in.close();
    }
}
