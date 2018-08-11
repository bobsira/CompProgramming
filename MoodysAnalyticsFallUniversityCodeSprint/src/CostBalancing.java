import java.util.Arrays;
import java.util.Scanner;

public class CostBalancing {
    static void printArray(int[] amountPaid){
        int k=0;
        while (k<amountPaid.length){
            System.out.println(k+1 +" "+amountPaid[k]);
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //total number of transactions
        int m = scanner.nextInt(); //total number of friends in the group
        int[] amountPaid = new int[m]; //index of the array is ID of the friend
        int total = 0;
        for (int i=0;i<n;i++){
            int ID = scanner.nextInt();
            int amount = scanner.nextInt();
            amountPaid[ID-1] += amount;
            // cumulative sum
            total+=amount;
        }
        //printArray(amountPaid);
        //System.out.println(total);
        int individualAmount = total / m;
        int rem = total % m;
        //System.out.println(individualAmount);
        //System.out.println(rem);
        int Anita = individualAmount + rem;
        for (int j=0;j<m;j++){
            if (j == 0)
                System.out.println((j+1)+" "+(amountPaid[j]-Anita));
            else
                System.out.println((j+1)+" "+(amountPaid[j]-individualAmount));
        }
    }
}
