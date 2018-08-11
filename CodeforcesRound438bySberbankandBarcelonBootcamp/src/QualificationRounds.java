import java.util.Arrays;
import java.util.Scanner;

public class QualificationRounds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[][] multiples = new int[N][K]; // 2D integer array with N rows and K columns
        for (int i=0; i<N;i++){
            for (int j=0;j<multiples[i].length;j++){
                multiples[i][j] = scanner.nextInt();
            }
        }

        boolean result = true;
        for (int i = 0; i < K; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += multiples[j][i];
            }
            System.out.println(sum);

            int test = sum;
            if (test > (N + 1)/2 ){
                result=false;
                System.exit(0);
            }
            //System.out.println(N);
//            if (sum < N ){
//                System.out.println(sum);
//                System.out.println(N);
//                result = true;
//            }
        }




        if (result)
            System.out.println("YES");
        System.out.println("NO");

    }
}
