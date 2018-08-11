package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {
    static void timeConversion(String s) {
        //Sample Input
        //07:05:45PM
        //Sample Output
        //19:05:45

        // split the time array
        String tArr[] = s.split(":");
        String AmPm = tArr[2].substring(2,4);

        int hh;
        int mm;
        int ss;

        hh = Integer.parseInt(tArr[0]);
        mm = Integer.parseInt(tArr[1]);
        ss = Integer.parseInt(tArr[2].substring(0,2));

        String checkPM = "PM";
        String checkAM = "AM";

        int h = hh;
        if (AmPm.equals(checkAM) && hh==12)
            h=0;
        else if (AmPm.equals(checkPM) && hh<12)
            h+=12;
        System.out.printf("%02d:%02d:%02d",h,mm,ss);
    }

    static void timeConversion1(String s){
        int n = s.length();
        int hh, mm, ss;
        hh = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        mm = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');
        ss = (s.charAt(6) - '0') * 10 + (s.charAt(7) - '0');

        if (hh < 12 && s.charAt(8) == 'P') hh += 12;
        if (hh == 12 && s.charAt(8) == 'A') hh = 0;

        System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        timeConversion1(s);
        //String result = timeConversion(s);
        //System.out.println(result);

    }
}
