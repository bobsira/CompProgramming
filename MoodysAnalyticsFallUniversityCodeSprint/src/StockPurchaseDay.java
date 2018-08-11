import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StockPurchaseDay {
    static int stockPurchaseDay(int[] A, int xi) {
        // Complete this function
        for (int i = A.length - 1; i >= 0; i--) {
            if (xi >= A[i]) {
                return i + 1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int min = 0;
        for(int A_i = 0; A_i < n; A_i++){
            int a = in.nextInt();
            A[A_i] = a;
            if(A_i == 0){
                min = a;
            }else {
                if(a < min)
                    min = a;
            }
        }
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int xi = in.nextInt();
            if (xi<min){
                System.out.println(-1);
                continue;
            }
            int result = stockPurchaseDay(A, xi);
            System.out.println(result);
        }
        in.close();
    }
}
