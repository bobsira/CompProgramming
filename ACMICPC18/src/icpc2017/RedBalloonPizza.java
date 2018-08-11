package icpc2017;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RedBalloonPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            while (scanner.hasNext()){
                if (n==-1)
                    return;
                HashMap<Integer,String> map= new HashMap<Integer, String>();
                for (int i=0;i<m;i++){
                    map.put(scanner.nextInt(),scanner.next());
                }

                for (Map.Entry entry : map.entrySet()) {
                    System.out.println(entry.getKey() + ", " + entry.getValue());
                }
            }
        }
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n, m;
//        while (scanner.hasNext()) {
//            n = scanner.nextInt();
//            if (n == -1)
//                return;
//            m = scanner.nextInt();
//
//            System.out.println(n + " " + m);
//
//            // toppings for the pizza
//            HashMap<Integer, String> toppingsMap = new HashMap<Integer, String>();
//            for (int j = 0; j < n; j++) {
//                int v = scanner.nextInt();
//                System.out.println(v);
//                String s = scanner.nextLine().trim();
//                System.out.println(s);
//                toppingsMap.put(v, s);
//            }
//            System.out.println(toppingsMap);
//
//            // customer's order
//
//            int noOfTopping = scanner.nextInt();
//            System.out.println(noOfTopping);
//
//
//            String toppings = scanner.next();
//            System.out.println(toppings);
//
//            String[] toppinglist = toppings.split(" ");
//            System.out.println(Arrays.toString(toppinglist));
//
//        }
//
//    }
}
