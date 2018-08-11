import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BobsGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            String[] board = new String[n];
            for(int board_i = 0; board_i < n; board_i++){
                board[board_i] = in.next();
            }
            // Write Your Code Here
        }
        in.close();
    }
}
