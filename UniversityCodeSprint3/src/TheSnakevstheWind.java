import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TheSnakevstheWind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char d = in.next().charAt(0);
        int x = in.nextInt();
        int y = in.nextInt();
        // Write Your Code Here
        int[][] board = new int[n][n];

        for (int row =0; row<board.length; row++){

            if (d == 'n' || d=='s'){

                for (int col=0;col<board[0].length;col++){
                    board[row][col] = row;

                }
                break;
            }

            if (d == 'e' || d=='w'){

                for (int col=0;col<board[0].length;col++){
                    board[row][col] = col;

                }
                break;
            }



        }
        in.close();


    }
}
