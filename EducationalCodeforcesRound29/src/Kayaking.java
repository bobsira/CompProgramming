import java.util.*;

public class Kayaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int tandemKayaks = N - 1;
        int singleKayaks = 2;
        int nPeople = 2 * N;
        int[] weight = new int[nPeople];

        for (int i=0;i<nPeople;i++){
            weight[i]=scanner.nextInt();
        }

        int stability = 0;


        Arrays.sort(weight);
        System.out.println(Arrays.toString(weight));
        int [] mod = Arrays.copyOfRange(weight,0,weight.length-2);

        for (int i =1; i<mod.length;i++){

            if (mod.length ==2){
                System.out.println(mod[1]-mod[0]);
                System.exit(0);
            }

            if (mod[i-1] != mod[i]){
                stability += mod[i] - mod[i-1];
            } else {
                System.out.println(mod[mod.length-1]-mod[0]);
                System.exit(0);
            }
        }
        System.out.println(stability);



        //System.out.println(Arrays.toString(mod));


    }
}
