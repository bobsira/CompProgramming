package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int max, int[] ar) {
        // Complete this function
        int n =0;
        for (int i=0;i<ar.length;i++){
            if (ar[i]==max)
                n++;
        }
        return n;
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int max = 0;
//        int n = in.nextInt();
//        int[] ar = new int[n];
//        for(int ar_i = 0; ar_i < n; ar_i++){
//            ar[ar_i] = in.nextInt();
//            if (ar[ar_i]>max){
//                max = ar[ar_i];
//            }
//        }
//        int result = birthdayCakeCandles(max, ar);
//        System.out.println(result);
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // the number of candles
    int n = scanner.nextInt();

    // store the current maximum height of any candle, initialize to
    // the minimum possible height of any candle
    int maxHeight = 1;

    // count the number of candles having the maximum height
    int countMax = 0;

    for (int i=0; i< n;i++){
        int tmp = scanner.nextInt();
        // if you read in a value larger than maxHeight,set new maxHeight
        if (tmp>maxHeight){
            maxHeight= tmp;
            countMax = 1 ;
        }else if (tmp==maxHeight){
            // increment the count of candles having maximum height
            countMax++;
        }
    }
    scanner.close();
    System.out.println(countMax);
}
}
