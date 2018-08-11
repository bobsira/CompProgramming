package icpc2016;

import java.util.ArrayList;
import java.util.Scanner;

public class PurpleBallonPowers {

    static boolean isPrime(int number) {
        int num = number;
        int i, count = 0;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        while ((input = scanner.nextInt()) > 0) {
            if (isPrime(input))
                System.out.println(input + "^" + 1);

        }

    }
}
