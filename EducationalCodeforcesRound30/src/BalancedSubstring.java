import java.util.Arrays;
import java.util.Scanner;

public class BalancedSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String toProcess = scanner.nextLine();
        //System.out.println(N);
        //System.out.println(toProcess);
//        if (!toProcess.contains("0")){
//            System.out.println(0);
//            System.exit(0);
//        }
//        if (!toProcess.contains("1")){
//            System.out.println(0);
//            System.exit(0);
//        }
        int number=0;
        for (int i=1;i<N;i++){
            //System.out.println(toProcess.substring(i-1,i+1));
            if (toProcess.substring(i-1,i+1).contains("10") || toProcess.substring(i-1,i+1).contains("01"))
                number++;
        }

        System.out.println(number);

    }
}
