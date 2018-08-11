import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class OddNumbers {
    /*
 * Complete the function below.
 */

    static int[] oddNumbers(int l, int r) {
        List<Integer> odd =  new ArrayList<Integer>();

        //ArrayList odd = new ArrayList();
        for (int i = l; i<=r;i++){
            if (!(i%2==0))
                odd.add(i);
        }

        int[] arr = odd.stream().mapToInt(i -> i).toArray();
        return arr;

    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int _l  = in.nextInt();
        int _r  = in.nextInt();
        int[] res;
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        int[] res;
//        int _l;
//        _l = Integer.parseInt(in.nextLine().trim());
//
//        int _r;
//        _r = Integer.parseInt(in.nextLine().trim());

        res = oddNumbers(_l, _r);
        for(int res_i=0; res_i < res.length; res_i++) {
//            bw.write(String.valueOf(res[res_i]));
//            bw.newLine();
            System.out.print(res[res_i]+ " ");
        }

        //bw.close();
        in.close();
    }
}
