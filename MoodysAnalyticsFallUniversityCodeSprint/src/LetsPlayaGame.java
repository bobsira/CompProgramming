import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LetsPlayaGame {
    static int playGame(String s, int[] arr) {
        // Complete this function
        return arr[1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();  // ith character denotes the color of the ith square
        int[] arr = new int[n];// number of coins in the ith square
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = playGame(s, arr);
        System.out.println(result);
        in.close();
    }
}
