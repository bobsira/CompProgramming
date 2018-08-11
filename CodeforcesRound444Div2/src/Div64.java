import java.util.Scanner;

public class Div64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (!s.contains("0"))
            System.out.println("no");

        StringBuilder stringBuilder = new StringBuilder(s);
        boolean poss = false;
        for (int i = 1; i < s.length() - 1; i++) {
            int x = stringBuilder.charAt(i);
            if (x == 49) {
                stringBuilder.deleteCharAt(i);
                int num = Integer.valueOf(stringBuilder.toString());
                if (num % 64 == 0)
                    poss = true;
            }
        }
        //System.out.println(stringBuilder);
        for (int i = stringBuilder.length()-1; i > 0; i--){
            if ((int)stringBuilder.charAt(i)==49)
                poss = false;
        }
        if (poss)
            System.out.println("yes");
        else
            System.out.println("no");


    }
}
