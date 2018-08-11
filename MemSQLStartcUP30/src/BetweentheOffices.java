import java.util.Scanner;

public class BetweentheOffices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        String S;
        N = scanner.nextInt();
        scanner.nextLine();
        S = scanner.nextLine();

        if (!S.contains("S")){
            System.out.println("NO");
            System.exit(0);
        }
        char[] s = S.toCharArray();
        if (s.length==2 && s[0]=='S'){
            System.out.println("YES");
            System.exit(0);
        }

        int countSF = 0;
        int countF = 0;

        for (int i =1; i<s.length-1; i++){
            if (s[i-1]=='F' && s[i]=='S'){
                countF++;
            }
            if (s[i-1]=='S' && s[i]=='F'){
                countSF++;
            }
        }

        if (countSF>countF){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        //System.out.println(N);
        //System.out.println(S);
    }
}
