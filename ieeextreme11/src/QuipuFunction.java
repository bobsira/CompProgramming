import java.util.*;
import java.lang.*;
import java.util.Scanner;
 class QuipuFunction {

    static int quipu(int n,int d) {
        int counter =0;
        int square_root = (int) Math.sqrt(n) + 1 ;
        for (int i=1;i<square_root;i++){
            if (n%i==0 && i%i!=n){
                if (i % d != 0)
                    counter++;
                if ((n/i) % d != 0)
                    counter++;
            }
            if (n%i==0 && i*i==n){
                if (i%d !=0){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int t = scanner.nextInt();
     int a = scanner.nextInt();
     int b = scanner.nextInt();
     for (int i=0;i<t;i++){
         int d = scanner.nextInt();
         int counter = 0;
         for (int j=a;j<=b;j++){
             int sum = quipu(j,d);
             counter+=sum;
         }
         System.out.println(counter);
     }
     scanner.close();

    }
}
