package DataStructure.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LeftRotation {

     static int[] rotateArray(int[] arr, int d){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = arr.length;

        // Create new array for rotated elements:
        int[] rotated = new int[n];

        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, d, rotated, 0, n - d);
        System.arraycopy(arr, 0, rotated, n - d, d);

        return rotated;
    }
    public static int[] rotateArray1(int[] arr, int d){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = arr.length;

        // Create a temporary d-element array to store elements shifted to the left of index 0:
        int[] temp_arr = Arrays.copyOfRange(arr, 0, d);

        // Shift elements from indices d through n to indices 0 through d - 1:
        for(int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy the d shifted elements from the temporary array back to the original array:
        for(int i = n - d; i < n; i++) {
            arr[i] = temp_arr[i-n+d];
        }

        return arr;
    }
    static int[] leftRotation(int[] a, int d) {
        // Complete this function
        while (d > 0){
            for (int i = 1; i < a.length; i++){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
            d--;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
