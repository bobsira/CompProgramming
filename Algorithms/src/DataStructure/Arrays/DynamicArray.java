package DataStructure.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        ArrayList<StringBuilder> seqList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            seqList.add(new StringBuilder());
        }
        int lastAnswer = 0;
        for (int i =0; i<Q;i++){
            int num = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (num==1){
                StringBuilder seq = seqList.get((x ^ lastAnswer) % N);
                seq.append(y);
            }

            if (num==2){
                StringBuilder seq = seqList.get((x ^ lastAnswer) % N);
                String result ="";
                result = result + seq.charAt(y % seq.length());
                lastAnswer = Integer.valueOf(result);
                //lastAnswer = seq.charAt(y % seq.length());
                System.out.print("\n"+lastAnswer);
            }
        }
    }
}
