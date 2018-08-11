package Arrays.ArraysDS;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] array = scanner.nextLine().split(" ");
        scanner.close();

        while (--n >=0){
            System.out.print(array[n]+" ");
        }
    }
}
