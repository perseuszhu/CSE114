package FinalProject;

import java.util.*;

public class FinalProject1 {


    public static void main(String[] args) {

        String [][] rr= new String[6][7];
        for (int i=0; i<6; i++) {
            for (int j=0; j<7; j++) {
                rr[i][j]=" ";
            }
        }

        int []drop= new int[7];
        for (int i=0; i<7; i++) {
            drop[i]=5;
        }

        int pan=0;
        int c1=0;

        prfor(rr);

        lableA:
        while(pan==0) {



            int getG = judge1(rr);
            if (getG==0) break lableA;

            if (c1%2==0) {
                System.out.print("Drop a red disk:");
            } else {
                System.out.print("Drop a yellow disk:");
            }
            c1++;

            Scanner sc= new Scanner(System.in);
            int ss= sc.nextInt();

            for (int i=0; i<7; i++) {
                if(ss==i) {
                    if(rr[drop[i]][i]!=" ") {
                        drop[i] = drop[i] - 1;
                    }
                    if (c1%2==0) {
                        rr[drop[i]][i]="Y";
                        prfor(rr);
                    } else {
                        rr[drop[i]][i]="R";
                        prfor(rr);
                    }
                }

            }
        }

    }

    public static void prfor(String [][] rr) {

        for (int i=0; i<6; i++) {
            for (int j=0; j<7; j++) {
                System.out.print("|"+rr[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static int judge1(String [][] rr) {

        for(int i=0; i<6; i++) {
            for(int j=0; j<4; j++) {
                if (rr[i][j]==rr[i][j+1] && rr[i][j]==rr[i][j+2] && rr[i][j]==rr[i][j+3] && rr[i][j]=="R") {
                    System.out.println("The red player won.");
                    return 0;
                }
                if (rr[i][j]==rr[i][j+1] && rr[i][j]==rr[i][j+2] && rr[i][j]==rr[i][j+3] && rr[i][j]=="Y") {
                    System.out.println("The yellow player won.");
                    return 0;
                }
            }
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<7; j++) {
                if (rr[i][j]==rr[i+1][j] && rr[i][j]==rr[i+2][j] && rr[i][j]==rr[i+3][j] && rr[i][j]=="R") {
                    System.out.println("The red player won.");
                    return 0;
                }
                if (rr[i][j]==rr[i+1][j] && rr[i][j]==rr[i+2][j] && rr[i][j]==rr[i+3][j] && rr[i][j]=="Y") {
                    System.out.println("The yellow player won.");
                    return 0;
                }
            }
            for(int j=0; j<4; j++) {
                if (rr[i][j]==rr[i+1][j+1] && rr[i][j]==rr[i+2][j+2] && rr[i][j]==rr[i+3][j+3] && rr[i][j]=="R") {
                    System.out.println("The red player won.");
                    return 0;
                }
                if (rr[i][j]==rr[i+1][j+1] && rr[i][j]==rr[i+2][j+2] && rr[i][j]==rr[i+3][j+3] && rr[i][j]=="Y") {
                    System.out.println("The yellow player won.");
                    return 0;
                }
            }
            for(int j=3; j<7; j++) {
                if (rr[i][j]==rr[i+1][j-1] && rr[i][j]==rr[i+2][j-2] && rr[i][j]==rr[i+3][j-3] && rr[i][j]=="Y") {
                    System.out.println("The yellow player won.");
                    return 0;
                }
                if (rr[i][j]==rr[i+1][j-1] && rr[i][j]==rr[i+2][j-2] && rr[i][j]==rr[i+3][j-3] && rr[i][j]=="R") {
                    System.out.println("The red player won.");
                    return 0;
                }
            }
        }
        return 1;
    }

}


