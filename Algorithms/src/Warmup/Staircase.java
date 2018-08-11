package Warmup;

import java.io.*;
import java.util.*;

public class Staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numInputs = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= numInputs; i++) { // rows

            int j = numInputs;

            // loop to print (size -i ) spaces
            while (j-- > i) {
                System.out.print(" ");
            }

            // loop to print (i) #s
            while (j-- >= 0) {
                System.out.print("#");
            }
            System.out.println();
        }


    }
}
