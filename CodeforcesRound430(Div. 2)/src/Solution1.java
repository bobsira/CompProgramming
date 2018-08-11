import java.util.Scanner;

public class Solution1 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int l,r,x,y,k;
        l = scan.nextInt();
        r = scan.nextInt();
        x = scan.nextInt();
        y = scan.nextInt();
        k = scan.nextInt();
        scan.close();

        double efficiency = y/r;
        if ( efficiency == k){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
