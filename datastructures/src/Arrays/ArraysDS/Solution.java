package Arrays.ArraysDS;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner= new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        int A[] = new int[N];
        for (int i =0; i <N; i++){
            A[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i =N-1; i>=0;i--){
            System.out.print(A[i]+" ");
        }
    }
}