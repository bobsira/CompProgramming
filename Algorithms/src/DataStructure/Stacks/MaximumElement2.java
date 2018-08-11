package DataStructure.Stacks;

import java.io.*;
import java.util.*;
public class MaximumElement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> trackStack = new Stack<>();
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++){
            int t  = scanner.nextInt();
            int v;
            if (i == 0){
                if (t == 1){
                    v = scanner.nextInt();
                    mainStack.push(v);
                    trackStack.push(v);
                }
            }
            if (t==1){
                v = scanner.nextInt();
                mainStack.push(v);
                if (v > trackStack.peek())
                    trackStack.push(v);
                else
                    trackStack.push(trackStack.peek());
            }
            if (t==2){
                if (!mainStack.empty())
                    mainStack.pop();
                if (!trackStack.empty())
                    trackStack.pop();
            }
            if (t==3){
                System.out.println(trackStack.peek());
            }
        }
    }
}
