import java.util.Arrays;
import java.util.Scanner;

public class TomRiddlesDiary {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        String[] people = new String[N];
        for (int i =0;i<N;i++){
            people[i] = scanner.next();
        }

        //System.out.println(Arrays.toString(people));

        for (int i=0;i<people.length;i++){
            if (i==0){
                System.out.println("NO");
                continue;
            }
            int counter=0;
            for (int j=0;j<i;j++){
                if (people[j].equals(people[i])){
                    counter++;
                }
            }
            if (counter>0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            }




        }
    }

