import java.util.Scanner;

public class TheIntriguingObsession {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && a == c){
            System.out.println((int)Math.pow(2,3));
        }

        //System.out.println(a+" "+b+" "+c);
    }
}
