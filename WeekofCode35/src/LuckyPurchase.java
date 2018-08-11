import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LuckyPurchase {
    public static void main(String[] args) {

        String name_one="";
        int value_one = 1000000000;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0+-+){
            String name = in.next();
            int value = in.nextInt();



            String value_price = String.valueOf(value);
            int numberOfFour = 0;
            int numberOfSeven = 0;
            for( int i=0; i<value_price.length(); i++ ) {
                if( value_price.charAt(i) == '4' ) {
                    numberOfFour++;
                }
                if( value_price.charAt(i) == '7' ) {
                    numberOfSeven++;
                }
            }

            if (numberOfFour == numberOfSeven){
                if (value < value_one){
                    name_one = name;
                    value_one = value;
                }
            }


        }

        System.out.println(name_one);
        System.out.println(value_one);
        in.close();
    }
}
