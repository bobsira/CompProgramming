package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ComparetheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] marks = new int[2];
        int marksA=0;
        int marksB=0;

        if (a0>b0)
            marksA++;
        if (a0<b0)
            marksB++;

        if (a1>b1)
            marksA++;
        if (a1<b1)
            marksB++;

        if (a2>b2)
            marksA++;
        if (a2<b2)
            marksB++;

        marks[0]=marksA;
        marks[1]=marksB;

        return marks;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        // another way
//        int[] a_triplet = new int[3];
//        int[] b_triplet = new int[3];
//        for (int i =0;i<3;i++){
//            a_triplet[i] = in.nextInt();
//        }
//        for (int i =0;i<3;i++){
//            b_triplet[i] = in.nextInt();
//        }
//        int alice_points = 0;
//        int bob_points = 0;
//        for (int i=0; i<3;i++){
//            if (a_triplet[i] > b_triplet[i]){
//                alice_points++;
//            }else if (a_triplet[i] < b_triplet[i]){
//                bob_points++;
//            }
//        }
//        System.out.printf("%d %d",alice_points,bob_points);


    }
}
