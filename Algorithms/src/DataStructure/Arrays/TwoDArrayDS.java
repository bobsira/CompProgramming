package DataStructure.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TwoDArrayDS {
    // Returns maximum sum of hour glass in ar[][]
    static int findMaxSum(int [][]mat) {
        //if (R<3 || C<3)
        //return -1;

        // Here loop runs (R-2)*(C-2) times considering
        // different top left cells of hour glasses.
        //int max_sum = INT_MIN;
        int max_sum = Integer.MIN_VALUE;
        for (int i=0; i<mat.length-2; i++)
        {
            for (int j=0; j<mat[0].length-2; j++)
            {
                // Considering mat[i][j] as top left cell of
                // hour glass.
                int sum = (mat[i][j]+mat[i][j+1]+mat[i][j+2])+
                        (mat[i+1][j+1])+
                        (mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);

                // If previous sum is less then current sum then
                // update new sum in max_sum
                //max_sum = max(max_sum, sum);
                if (max_sum < sum)
                    max_sum = sum;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int result = findMaxSum(arr);
        System.out.println(result);
    }
}

