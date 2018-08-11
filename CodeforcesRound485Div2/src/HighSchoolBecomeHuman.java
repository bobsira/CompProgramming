import java.util.Scanner;

public class HighSchoolBecomeHuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x==y){
            System.out.println("=");
            System.exit(0);
        }
        if (x==1 && y >1){
            System.out.println("<");
            System.exit(0);
        }
        if (x>1 && y==1){
            System.out.println(">");
            System.exit(0);
        }
        if (x<y) {
            System.out.println(">");
            System.exit(0);
        }
        if (x>y){
            System.out.println("<");
            System.exit(0);
        }
    }
}
