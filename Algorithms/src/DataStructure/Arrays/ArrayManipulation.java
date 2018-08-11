package DataStructure.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int n = in.nextInt();
        int[] list = new int[n];
        int m = in.nextInt();
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            for (int j = a-1; j <=b-1;j++){
                list[j]+=k;
                if (max<list[j])
                    max=list[j];
            }
        }
        System.out.println(max);
        in.close();
    }
}
