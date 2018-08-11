package Implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }

        for (int i=0;i<n;i++){

            int value = 5 - (grades[i]%5);
            if (value>=3 || grades[i]<38){
                System.out.println(grades[i]);
            }else {
                System.out.println(grades[i]+value);
            }
        }
        //  System.out.println(grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)));


    }
}
