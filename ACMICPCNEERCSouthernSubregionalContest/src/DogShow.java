
import java.util.Scanner;

public class DogShow {

    public static int maxBowls(int[] food,int time){
        if (time <= 1){
            return 0;
        }



        return time - food[food.length-1];

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,T;
        n = scanner.nextInt();
        T = scanner.nextInt();
        int[] time = new int[n];
        for (int i =0; i<n;i++){
            time[i] = scanner.nextInt();
        }
        System.out.println(maxBowls(time,T));

    }
}
