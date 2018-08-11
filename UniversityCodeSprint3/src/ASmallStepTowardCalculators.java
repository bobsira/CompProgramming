import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ASmallStepTowardCalculators {

    static int solve(String opr) {
        // Complete this function
         int [] a = new int [opr.length()];
         char operation = opr.charAt(1);

         a[0] = opr.charAt(0);
         a[1]= opr.charAt(2);

         if (operation=='+'){
             return a[0] + a[1] - 96 ;
         }else {
             return a[0] - a[1];
         }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
