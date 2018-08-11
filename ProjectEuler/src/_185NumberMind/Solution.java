package _185NumberMind;



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();

        String[]Guess = new String[N];
        String[]Result= new String[N];
        String[] Answer=new String[N];


        for (int i =0; i<N; i++){
            Guess[i] = scanner.next();
            Result[i] = scanner.nextLine();
        }

        char value = 0;
        int start =0;
        for (int i =0; i<N-1; i++){
//            System.out.println(Guess[i]);
//            System.out.println(Result[i]);
//            System.out.println(Answer[i]);
//            for (int j =0; j <N-1; j++){
//                if (Guess[i].charAt(i) == Guess[j].charAt(j)){
//                    System.out.println("Possible");
//                }
//            }
            char temp = Guess[i].charAt(start);
            if (temp==value){
                Answer[i]=String.valueOf(temp);
                break;
            }
        }
        System.out.println(Arrays.toString(Answer));



//            System.out.println(Guess[0]);
//            char[] numberi=Guess[0].toCharArray();
//            System.out.println(numberi[0]);
//
//            if (numberi[0]==numberi[1]){
//                Answer[0]=String.valueOf(numberi[0]);
//                System.out.println(Arrays.toString(Answer));
//            }

//        char[] newArray;
//            for (int i =0;i<N;i++){
//                newArray=Guess[i].toCharArray();
//                for (int j=0;j<N;j++){
//                    if (newArray[j]==newArray[i]){
//                        Answer[i]=String.valueOf(newArray[i]);
//                        break;
//                    }
//                    System.out.println(newArray[i]);
//                }
//            }



//        System.out.println(Arrays.toString(Answer));
    }
}
