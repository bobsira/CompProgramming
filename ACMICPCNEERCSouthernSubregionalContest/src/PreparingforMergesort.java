
import java.util.Scanner;

public class PreparingforMergesort {

    public static String processArray(int[] array){
        String output = ""+array[0];
        for (int i =0,j=i+1;i <array.length-1;i++,j++){

            if (array[i] < array[j]){
                output= output +" " +  array[j];
            }

            if (array[i] > array[j]){
                output += "\n";
                output +=array[j];
            }

        }
       return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i =0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(processArray(array));

    }
}
