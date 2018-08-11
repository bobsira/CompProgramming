import java.util.Scanner;

public class GameofLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // size of the board
        int m = scanner.nextInt(); // size of the board
        int c = scanner.nextInt(); // number of iterations that you must simulate
        char[][] board = new char[n][m];

        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                board[i][j] = scanner.next().charAt(j);
            }
        }
    }
}
