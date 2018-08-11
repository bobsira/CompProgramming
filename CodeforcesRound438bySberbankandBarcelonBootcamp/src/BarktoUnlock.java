import java.util.Arrays;
import java.util.Scanner;

public class BarktoUnlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        int N = scanner.nextInt();
        String[] words = new String[N];
        for (int i =0;i<N;i++){
            words[i] = scanner.next();
        }
        char first = password.charAt(0);
        char second = password.charAt(1);
        boolean testOne = false;
        boolean testTwo = false;
        for (int i=0;i<words.length;i++){
            if (words.length==1){
                if (password.equals(words[i]) || password.equals(new StringBuffer(words[i]).reverse().toString())){
                    System.out.println("YES");
                    System.exit(0);
                }
            }
            if (words[i].charAt(0)==second)
                testTwo = true;
            if (words[i].contains(String.valueOf(first)))
                testOne=true;

            if (password.equals(words[i])){
                System.out.println("YES");
                System.exit(0);
            }
        }
        if (testOne && testTwo)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
