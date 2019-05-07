package FinalProject;

import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        String[][] board = new String[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = " ";
            }
        }
        int[] drop = new int[7];
        for (int i = 0; i < 7; i++) {
            drop[i] = 5;
        }
        int t = 0;
        String r = "";
        draw(board);
        status:
        while (true) {

            if (win(board) == 0) break status;

            if (t % 2 == 0) {
                System.out.print("Drop a red disk:");
            } else {
                System.out.print("Drop a yellow disk:");
            }
            t++;

            Scanner in = new Scanner(System.in);
            int loc = in.nextInt();

            try {
                if (t % 2 == 0) {
                    r = "R";
                } else {
                    r = "Y";
                }
                step(board, loc, r);
            } catch (ArrayIndexOutOfBoundsException e) {
                while (loc > 6 || loc < 0) {
                    System.out.println("Invalid number, please enter another number");
                    loc = in.nextInt();
                }
                step(board, loc, r);
            }
        }


    }

    private static String[][] step(String[][] board, int loc, String player) {
        for (int i = 5; i >= 0; i--) {
            if (board[i][loc].equals(" ")) {
                board[i][loc] = player;
                break;
            }
        }
        draw(board);
        return board;
    }

    private static void draw(String[][] board) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }
    private static void whichOne(String player){
       if (player == "Y") {
                System.out.println("The yellow player won.");
            } else {
                System.out.println("The red player won.");
            }
    }

    private static int win(String[][] board) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] != " " && board[i][j] == board[i][j + 1] && board[i][j] == board[i][j + 2] && board[i][j] == board[i][j + 3]) {
                    whichOne(board[i][j]);
                    return 0;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] != " " && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 2][j] && board[i][j] == board[i + 3][j]) {
                    whichOne(board[i][j]);
                    return 0;
                }
            }
            for (int j = 0; j < 4; j++) {
                if (board[i][j] != " " && board[i][j] == board[i + 1][j + 1] && board[i][j] == board[i + 2][j + 2] && board[i][j] == board[i + 3][j + 3]) {
                    whichOne(board[i][j]);
                    return 0;
                }
            }
                for (int j = 3; j < 7; j++) {
                    if (board[i][j] != " " && board[i][j] == board[i + 1][j - 1] && board[i][j] == board[i + 2][j - 2] && board[i][j] == board[i + 3][j - 3]) {
                        whichOne(board[i][j]);
                        return 0;
                    }
            }
        }
        return 1;
    }
}


