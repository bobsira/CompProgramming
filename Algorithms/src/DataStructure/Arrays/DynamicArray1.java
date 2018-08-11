package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numQueries = scanner.nextInt();

        // Initialize Empty Sequences
        ArrayList<ArrayList<Integer>> seqN = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++){
            seqN.add(new ArrayList<Integer>());
        }

        // Process Queries
        int lastAns = 0;
        for (int i =0 ; i < numQueries; i++){
            int queryType = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int seqIndex = ((x ^ lastAns) % n);
            ArrayList<Integer> currSeq = seqN.get(seqIndex);
            if (queryType==1)
                currSeq.add(y);
            else {
                // Query type 2
                lastAns = currSeq.get(y % currSeq.size());
                System.out.println(lastAns);
            }
        }
        scanner.close();
    }
}
