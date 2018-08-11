import java.util.Scanner;

public class RunningUpStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of instances of the problem
        for (int i=0; i<t;i++){
            int n = Integer.valueOf(scanner.next());
            //int n = scanner.nextInt();
            if (n<4)
                System.out.println(n);
            else {
                double a = n-2;
                System.out.println((int)Math.pow(2.0,a));
            }
        }
    }
}
