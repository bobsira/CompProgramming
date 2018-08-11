package DataStructure.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class SparseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] strings = new String[N];
        for (int i = 0; i < N; i++){
            strings[i]= scanner.next();
        }
        int Q = scanner.nextInt();
        String[] queries = new String[Q];
        for (int i = 0; i < Q; i++){
            queries[i] = scanner.next();
        }

        for (int j = 0; j < Q; j++){
            int count = 0;
            for (int i = 0; i < strings.length; i++){
                if (strings[i].equals(queries[j])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
