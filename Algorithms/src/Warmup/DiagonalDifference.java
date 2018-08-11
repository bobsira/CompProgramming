package Warmup;
import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] board = new int[N][N];

        long d1=0;
        long d2 =0;
        for (int row=0;row<N;row++){
            for (int col=0;col<board[row].length;col++){
                // populate the board first
                board[row][col] = scanner.nextInt();

                // board[row][col] lies on the first diagonal if row == col
                if (row==col){
                    d1 += board[row][col];
                }

                // board[row][col] lies on the first diagonal if row == N - 1 - col
                if (row==N-1-col){
                    d2 +=board[row][col];
                }
            }
        }
        System.out.println(Math.abs(d1-d2));


    }
}
