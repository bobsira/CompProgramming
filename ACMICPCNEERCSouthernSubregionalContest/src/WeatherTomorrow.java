import java.util.Scanner;

public class WeatherTomorrow {
    public static void main(String[] args) {
        int n; //the number of days for which the average air temperature is known.
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] t = new int[n]; //where ti is the average temperature in the i-th day.
        for (int i =0; i<n;i++){
            t[i] = scanner.nextInt();
        }

        // arithmetic progression
        // An = A1 + ( N - 1) d

        boolean isArithmeticProgression = true;
        int difference = 0; // the common difference

        for (int i =0; i <n; i++){
            // we are at the first entry continue
            if (i == 0){
                continue;
            }

            // difference as the iterate the values
            //int difference1 = 0;
            int difference1 = t[i] - t[i -1];

            // obtain the common difference for the arithmetic progression
            if (i == 1){
                difference =difference1;
                if (t.length>2){
                    continue;
                }
            }


            if (difference1 == difference){
                isArithmeticProgression = true;
            }else {
                isArithmeticProgression = false;
                if (t.length > 4 ){
                    break;
                }
            }


            // Only one value for the average air temperature
            if (n ==1 ){
                System.out.println(t[n-1]);
                break;
            }


            if (isArithmeticProgression){
                System.out.println(t[n-1] + difference);
                break;
            }else {
                System.out.println(t[n-1]);
                break;
            }

        }
    }
}