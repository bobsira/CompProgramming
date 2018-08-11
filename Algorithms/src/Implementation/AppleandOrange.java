package Implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleandOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int applesInHouse = 0;
        int orangesInHouse = 0;
        for (int i=0; i < apple.length;i++){
            int compareApples = a + apple[i];
            if (compareApples>=s && compareApples<=t)
                applesInHouse++;
        }
        for (int i =0;i<orange.length;i++){
            int compareOranges = b + orange[i];
            if (compareOranges>=s && compareOranges<=t)
                orangesInHouse++;
        }
        System.out.println(applesInHouse);
        System.out.println(orangesInHouse);

    }
}
