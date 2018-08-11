import java.util.Scanner;

public class Quasipalindrome {

    public static String isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);


        sb.reverse();
        String rev=sb.toString();

        String zero="";

        if(str.equals(rev)){
            return "YES";
        }else{
            char[] charRev = rev.toCharArray();
            for (int i=0;i<charRev.length;i++){
                if (charRev[i]=='0'){
                    zero+="0";
                }else {
                    break;
                }
            }
            StringBuffer stringBuffer = new StringBuffer(str);

            stringBuffer.insert(0,zero);


            String plusZero = stringBuffer.toString();

            String plusZeroRev = stringBuffer.reverse().toString();


            if (plusZero.equals(plusZeroRev)){
                return "YES";
            }

            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(isPalindrome(input));

    }
}
