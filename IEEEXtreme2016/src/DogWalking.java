import java.util.Arrays;
import java.util.Scanner;

public class DogWalking {
    public static int minimumSumofRanges(int[] arr, int k){
        int sum = 0;
        // case of no dogs
        if (arr.length==0)
            return 0;
        // case of equal number of dogs and employees
        if (arr.length-k==0)
            return 0;
        // case where (dogs-employees) % 2 is not even
        if ((arr.length - k) % 2 != 0){
            int index = (arr.length + 1) / 2;
            sum = arr[index] - arr[index-1];
        }
        // case where (dogs-employees) % 2 is even
        if ((arr.length - k) % 2 == 0){
            for (int i =1; i<arr.length;i=i+k){
                sum += arr[i] - arr[i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt(); // number of test cases
        for (int i=0;i<t;i++){
            int N = scanner.nextInt(); // number of dogs
            int K = scanner.nextInt(); // number of employees
            int[] x = new int[N];      // array x for the size of the corresponding dog
            for (int j=0;j<x.length;j++){
                x[j] = scanner.nextInt();
            }
            // sort the array of the corresponding size of the dogs
            Arrays.sort(x);
            //System.out.println(Arrays.toString(x));
            int result = minimumSumofRanges(x,K);
            System.out.println(result);

        }
    }
}
