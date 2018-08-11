import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class InfinityGauntlet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fullList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        fullList.add("purple");
        fullList.add("green");
        fullList.add("blue");
        fullList.add("orange");
        fullList.add("red");
        fullList.add("yellow");
        int n = scanner.nextInt();
        for (int i =0; i <n; i++){
            newList.add(scanner.next());
        }

        fullList.removeAll(newList);
        System.out.println(fullList.size());
        for (int j =0; j <fullList.size();j++){
            String output = fullList.get(j);
            if (output=="purple") System.out.println("Power");
            if (output=="green") System.out.println("Time");
            if (output=="blue") System.out.println("Space");
            if (output=="orange") System.out.println("Soul");
            if (output=="red") System.out.println("Reality");
            if (output=="yellow") System.out.println("Mind");
        }
    }
}
