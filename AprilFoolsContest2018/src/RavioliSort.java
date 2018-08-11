import java.util.Scanner;
import java.util.Stack;

public class RavioliSort {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
    public static String isValioCorrect(int[] arr){
        for (int i = 1; i < arr.length; i ++){
            if (arr[i] < arr[i-1]){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int[] stack = new int[N];
        int diff = 0;
        for (int i = arr.length-1; i > 0; i--){
            stack[i] = arr[i];
            if (arr[i] < arr[i-1]){
                diff = arr[i-1] - arr[i];
                stack[i] += diff;
            }
        }

        //System.out.println(isValioCorrect(arr));

        printArray(arr);
        System.out.println();
        printArray(stack);
    }
}
