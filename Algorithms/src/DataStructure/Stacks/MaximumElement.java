package DataStructure.Stacks;
import java.io.*;
import java.util.*;
public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> integers = new Stack<>();
        int max = 0;
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++){
            int t  = scanner.nextInt();
            int v;
            if (t == 1){
                v = scanner.nextInt();
                integers.push(v);
            }
            if (t==2){
                if (!integers.empty())
                    integers.pop();
            }
            if (t==3){
                Iterator<Integer> iterator= integers.iterator();
                while (iterator.hasNext()){
                    if (!integers.empty()){
                        if (integers.peek() > max)
                            max = integers.peek();
                    }
                }
                System.out.println(max);
            }
        }
    }
}
