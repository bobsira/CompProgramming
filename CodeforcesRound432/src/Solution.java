import java.util.*;

public class Solution {

    public static int ans(int n,int k,int t){

        int totalTime = n + k + 1;
        int[] time = new int[totalTime];
        int standing = 0;
        for (int i = 0; i < totalTime; i++) {
            if (i <= k) {
                time[i] = standing;
                standing++;
            }
        }

        for (int i = k; i <k+k;i++ ){
            time[i] = time[k];
        }

        for (int j = n ; j <=n+k; j++){
            time[j] = --standing;
        }


        //System.out.println(Arrays.toString(time));

        return time[t];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k, t;
        n = scanner.nextInt();
        k = scanner.nextInt();
        t = scanner.nextInt();
        System.out.println(ans(n,k,t));


    }


}

