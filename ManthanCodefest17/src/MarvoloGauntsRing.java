import java.util.Arrays;
import java.util.Scanner;

public class MarvoloGauntsRing {
    public static void main(String[] args) {
        int n,p,q,r;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        p=scanner.nextInt();
        q=scanner.nextInt();
        r=scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        if (arr[0]>0){
            int sum = 0;
            if (p<0)
                sum+=p*arr[0];
            else
                sum+=p*arr[arr.length-1];

            if (q<0)
                sum+=q*arr[0];
            else
                sum+=q*arr[arr.length-1];


            if (r<0)
                sum+=r*arr[0];
            else
                sum+=r*arr[arr.length-1];

            System.out.println(sum);

        }else {
            int sum = 0;

            if (r<0 &&  p >0 && q>0){
               System.out.println(
                       r*arr[0]+
                               p*arr[arr.length-1]+
                               q*arr[arr.length-1]
               );
               System.exit(0);
           }
            if (p<0)
                sum+=p*arr[0];
            else{
                int toUse;
                if (Math.abs(arr[0])>Math.abs(arr[arr.length-1])){
                    toUse=arr[0];

                }else {
                    toUse=arr[arr.length-1];
                }
                sum+=p*toUse;
            }

            if (q<0){
                sum+=q*arr[0];
            }else {
                int toUse;
                if (Math.abs(arr[0])>Math.abs(arr[arr.length-1])){
                    toUse=arr[0];

                }else {
                    toUse=arr[arr.length-1];
                }
                sum+=q*toUse;
            }

            if (r<0){
                sum+=r*arr[0];
            }
            else {
                int toUse;
                if (Math.abs(arr[0])>Math.abs(arr[arr.length-1]))
                    toUse=arr[0];
                else
                    toUse=arr[arr.length-1];
                sum+=r*toUse;
            }
            System.out.println(sum);
//        if (arr[0]>0){
//            int high = arr[arr.length-1];
//               int result = p * high + q*high + r*high;
//               System.out.println(result);
//               System.exit(0);
//        }else {
//            if (r<0){
//                System.out.println(
//                        p*arr[0]+
//                                q*arr[0]+
//                                r*arr[arr.length-1]
//                );
//            }
//            if (p<0){
//                System.out.println(
//                        r*arr[0]+
//                                q*arr[0]+
//                                p*arr[arr.length-1]
//                );
//            }
//            if (q<0){
//                System.out.println(
//                        p*arr[0]+
//                                r*arr[0]+
//                                q*arr[arr.length-1]
//                );
//            }
//        }
        //System.out.println(Arrays.toString(arr));
//       if (arr[0]>0){
//           if (p<0){
//               int high = arr[arr.length-1];
//               int result = p * arr[0] + q*high + r*high;
//               System.out.println(result);
//               System.exit(0);
//           }
//           if (q<0){
//               int high = arr[arr.length-1];
//               int result = p * high + q*arr[0] + r*high;
//               System.out.println(result);
//               System.exit(0);
//           }
//           if (r<0){
//               int high = arr[arr.length-1];
//               int result = p * high + q*high + r*arr[0];
//               System.out.println(result);
//               System.exit(0);
//           }
//
//           if (p>0 && q>0 && r>0){
//               int high = arr[arr.length-1];
//               int result = p * high + q*high + r*high;
//               System.out.println(result);
//               System.exit(0);
//           }
//
//       }else {
//           if (p<0 && q<0 && r<0){
//               int high = arr[0];
//               int result = p * high + q*high + r*high;
//               System.out.println(result);
//               System.exit(0);
//           }
//           if (p<0 && q >0 && r>0){
//               System.out.println(
//                       Math.abs(p*arr[0]+
//                               q*arr[arr.length-1]+
//                               r*arr[arr.length-1])
//               );
//               System.exit(0);
//           }
//           if (r<0 &&  p >0 && q>0){
//               System.out.println(
//                       r*arr[0]+
//                               p*arr[arr.length-1]+
//                               q*arr[arr.length-1]
//               );
//               System.exit(0);
//           }
//           if (q<0 &&  p >0 && r>0){
//               System.out.println(
//                       Math.abs(q*arr[0]+
//                               p*arr[arr.length-1]+
//                               r*arr[arr.length-1])
//               );
//               System.exit(0);
//           }
//       }

    }
}}
