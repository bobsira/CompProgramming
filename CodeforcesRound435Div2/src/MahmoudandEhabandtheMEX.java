import java.util.*;

public class MahmoudandEhabandtheMEX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n; // size of the set of Dr. Evil owns
        int x; // the desired MEX

        n = scanner.nextInt();
        x = scanner.nextInt();

        int[] evil = new int[n];
        
        for (int i=0;i<n;i++){
            evil[i] = scanner.nextInt();
        }

        if (x == 0 && n ==1){
            System.out.println(1);
            System.exit(0);
        }
        int sum =0;
        for (int i =0; i<x; i++){
            sum+=i;
        }
        if (evil[0] == 0){
            System.out.println(sum-1);
            System.exit(0);
        }



        if (x>1 && n>1){
            System.out.println(x-1);
            System.exit(0);
        }



        System.out.println(sum);

//        Arrays.sort(evil);
//        int[] wholeSet = new int[evil[evil.length-1]];
//        int[] comp = new int[wholeSet.length - evil.length];
//
//        for (int i =0; i<wholeSet.length;i++){
//            wholeSet[i] = i;
//            if ()
//        }

    }

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int n; // size of the set of Dr. Evil owns
//        int x; // the desired MEX
//        n = scanner.nextInt();
//        x = scanner.nextInt();
//
//        int numberOfOperations=0;
//
//        List evilSet = new ArrayList();
//        for(int i=0;i<n;i++){
//            evilSet.add(scanner.nextInt());
//        }
//
//        int max = (int) evilSet.get(evilSet.size() - 1);
//        List  wholeSet = new ArrayList();
//        for (int i=0;i<max+1;i++){
//            wholeSet.add(i);
//        }
//
//        List evilSetCompliment = new ArrayList(wholeSet);
//        evilSetCompliment.removeAll(evilSet);
//
//        for (int i =0; i<evilSetCompliment.size()-1;i++){
//            int value = 0;
//
//            if ( i == 0){
//                 if (x == (int) evilSetCompliment.get(0)){
//                     System.out.println(numberOfOperations);
//                     break;
//                 }
//                 continue;
//            }
//
//            value += (int) evilSetCompliment.get(i);
//            if (x == value){
//                System.out.println(numberOfOperations);
//                break;
//            }
//            if (x > value){
//                numberOfOperations++;
//            }
//            System.out.println(numberOfOperations);
//
//            }
//
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n; // size of the set of Dr. Evil owns
//        int x; // the desired MEX
//        n = scanner.nextInt();
//        x = scanner.nextInt();
//        int[] set = new int[n];
//        for(int i=0;i<n;i++){
//            set[i] = scanner.nextInt();
//        }
//        scanner.close();
//        Arrays.sort(set);
//
//        //System.out.println(Arrays.toString(set));
//        //System.out.println(set[0]);
//
//        //  generate the whole set
//        int sizeOfTheWholeSet = set[set.length-1]+1;
//        int[] wholeSet = new int[sizeOfTheWholeSet];
//        for (int i =0; i<=sizeOfTheWholeSet-1;i++){
//            wholeSet[i]=i;
//        }
//        //System.out.println(Arrays.toString(wholeSet));
//        //System.out.println(wholeSet[0]);
//
//        int[] complementSet = new int[sizeOfTheWholeSet-n];
//
//
//        int numberOfOperations = 0;
//        for (int i =0; i<complementSet.length; i++){
//
//
//            if (!(wholeSet[i] != set[i])){
//                complementSet[i] = wholeSet[i];
//            }
//
//            int dummyx =  0;
//
//            if (x > dummyx){
//                dummyx += complementSet[i];
//                numberOfOperations++;
//            }
//
//            if (x ==dummyx){
//                System.out.println(numberOfOperations);
//            }
//        }
//        //System.out.println(Arrays.toString(complementSet));
//
////
////        int counter = 0;
////
////        for (int i = 0; i < sizeOfTheWholeSet-1; i++){
////            wholeSet[i] = i;
////
////            if (wholeSet[i] != set[i]){
////                complementSet[i] = wholeSet[i];
////            }
////        }
//
//
//
//
//
//
//    }
}
