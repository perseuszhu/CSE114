package FinalProject;

import java.util.Scanner;

public class FinalProject2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[][] four = new String[6][7];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                four[i][j] = " ";
                System.out.print("|" + four[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("---------------------");

        boolean rwin = false;
        boolean ywin = false;
        int next = 0;
        while (!rwin && !ywin)
        {
            try {
                System.out.print("Drop a red disk at column (0-6): ");
                next = s.nextInt();
                drop(four, next, "R");
            } catch (ArrayIndexOutOfBoundsException e) {
                while (next > 6 || next < 0) {
                    System.out.println("Invalid number, please re-enter a number");
                    next = s.nextInt();
                }
                drop(four, next, "R");
            }
            for (int i = 0; i < 6; i++)
            {
                for (int j = 0; j < 7; j++)
                {
                    System.out.print("|" + four[i][j]);
                }
                System.out.println("|");
            }
            System.out.println("---------------------");
            rwin = win(rwin, four, "R");
            if (rwin) {
                System.out.println("The red player won.");
                break;
            }

            try {
                System.out.print("Drop a yellow disk at column (0-6): ");
                next = s.nextInt();
                drop(four, next, "Y");
            } catch (ArrayIndexOutOfBoundsException e) {
                while (next > 6 || next < 0) {
                    System.out.println("Invalid number, please re-enter a number");
                    next = s.nextInt();
                }
                drop(four, next, "Y");
            }
            for (int i = 0; i < 6; i++)
            {
                for (int j = 0; j < 7; j++)
                {
                    System.out.print("|" + four[i][j]);
                }
                System.out.println("|");
            }
            System.out.println("---------------------");
            ywin = win(ywin, four, "Y");
            if (ywin) {
                System.out.println("The yellow player won.");
                break;
            }
        }
    }

    // drop the disk
    public static String[][] drop(String[][] a, int b, String c) {
        for (int i = 5; i >= 0; i--) {
            if (a[i][b].equals(" ")) {
                a[i][b] = c;
                break;
            }
        }

        return a;
    }
    // judge if win
    public static boolean win(boolean a, String[][] b, String c) {
        int count = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            for (int j = 0; j < b[i].length - 1; j++) {
                if (b[i][j].equals(c))
                    count++;
                else
                    count = 0;
                if (count == 4)
                    return true;
            }
            for (int j = 0; j <= i; j++) {
                if (b[i - j][j].equals(c))
                    count++;
                else
                    count = 0;
                if (count == 4)
                    return true;
            }
            for (int j = 0; j < b[i].length - 1 - i; j ++) {
                if (b[i + j][j].equals(c))
                    count++;
                else
                    count = 0;
                if (count == 4)
                    return true;
            }
            count = 0;
        }
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < b.length; j++) {
                if (b[j][i].equals(c))
                    count++;
                else
                    count = 0;
                if (count == 4)
                    return true;
            }
            for (int j = 1; j < b[1].length - i; j++) {
                if (b[j - 1][i + j].equals(c))
                    count++;
                else
                    count = 0;
                if (count == 4)
                    return true;
            }
            for (int j = 5; j > i - 1; j--) {
                if (b[j][i + 5 - j].equals(c))
                    count++;
                else
                    count = 0;
                if (count == 4)
                    return true;
            }
        }
        return false;
    }
}
