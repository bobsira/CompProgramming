
import java.util.Scanner;

public class BerlandElection {
    public static void main(String[] args) {
        int n,k,m,a;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); // number of candidates
        k = scanner.nextInt(); // number of seats in parliament
        m = scanner.nextInt(); // number of Berland citizens
        a = scanner.nextInt(); // number of citizens who already have voted

        int[] g = new int[a];  // candidate for which the citizen at i-th position voted for
        for (int i =0; i < a; i++){
            g[i] = scanner.nextInt();
        }
        scanner.close();


    }

}
