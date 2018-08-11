import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class EruptingVolcanoes {

    public static int  calculateDistance(int x, int y, int x1, int y1){
        return (int) Math.sqrt(Math.pow(x+x1,2) + Math.pow(y+y1,2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        int m = in.nextInt();
        int count =0;

        int distance = 0;
        int totalMagnitude = 0;


        for(int a0 = 0; a0 < m; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int w = in.nextInt();
            // Write Your Code Here
            if ( m == 1){
                // Only one volcano present
                System.out.println(w);
                System.exit(0);
            }



            // Temporary code for the challenge
            if (w>count){
                count=w;
            }
        }
        System.out.println(count);
        in.close();


        // let's loop through array to print each row and column
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }
    }
    }

