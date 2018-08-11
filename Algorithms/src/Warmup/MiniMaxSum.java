package Warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {
    //    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        int[] A = new int[5];
//        for (int i=0;i<5;i++){
//            A[i] = scanner.nextInt();
//        }
//        scanner.close();
//        Arrays.sort(A);
//        System.out.print((long)A[0]+A[1]+A[2]+A[3]+" ");
//        System.out.print((long)A[4]+A[3]+A[2]+A[1]);
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = 0;

        for (int i=0;i<5;i++){
            long n = scan.nextLong();
            sum += n;
            if (min>n)
                min=n;
            if (max<n)
                max=n;
        }

        scan.close();

        System.out.println((sum - max) + " " + (sum - min));
    }
}
