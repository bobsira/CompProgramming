import java.math.BigInteger;
import java.util.Scanner;

public class Solution0 {
    public static String answer(int[]A){
        if (A[0] % 2 == 0)
            return "NO";
        if (A[A.length -1] % 2 ==0)
            return "NO";

        int oddCounter=0;
        int evenCounter=0;

        for (int i =0; i < A.length; i++){
            if (A[i] % 2 == 0){
                evenCounter++;
            }
            else {
                oddCounter++;
            }
        }

        if (evenCounter % 2 == 0 && !(oddCounter % 2 ==0) || !(evenCounter % 2 ==0 ) && oddCounter % 2 == 0){
            return "YES";
        }
        else {
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for (int i =0;i<n;i++){
            A[i] = in.nextInt();
        }


        System.out.println(answer(A));
    }
}
