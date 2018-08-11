package Warmup;
import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int pC=0,nC=0,zC=0;
        for (int i=0;i<N;i++){
            A[i] = scanner.nextInt();
            if (A[i]==0)
                zC++;
            if (A[i]<0)
                nC++;
            if (A[i]>0)
                pC++;
        }
        System.out.println((float) pC/N);
        System.out.println((float)nC/N);
        System.out.println((float)zC/N);
    }
}
