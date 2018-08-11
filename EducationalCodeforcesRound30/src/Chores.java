import java.util.Arrays;
import java.util.Scanner;

public class Chores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//the number of chores Luba has to do
        int k = scanner.nextInt();//the number of chores she can do in x units of time
        int x = scanner.nextInt();//and the number x itself
        int[] ai = new int[n];// the time Luba has to spend to do i-th chore.
        for (int i=0;i<ai.length;i++){
            ai[i] = scanner.nextInt();
        }
        int sum = 0;
        int diff= n-k;
        for (int i=0;i<ai.length;i++){
            if (i==diff || i>diff){
                sum+=x;
            }else {
                sum+=ai[i];
            }



        }
        System.out.println(sum);

    }
}
