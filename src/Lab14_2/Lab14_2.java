package Lab14_2;

import java.util.Scanner;

public class Lab14_2 {
    public static double sumMajorDiagonal(double[][] m){
        double result=0;
        for(int i =0; i<4; i++){
            result = m[i][i]+result;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double [][] m = new double[4][4];
        System.out.println("Enter a 4 by 4 matrix row by row");
        for(int i=0; i<4;i++){
            for(int j=0; j<4; j++){
                m[i][j]=in.nextDouble();
            }
        }
        double result = sumMajorDiagonal(m);
        for(int i =0; i<4; i++){
            System.out.println(m[i][0]+" "+m[i][1]+" "+m[i][2]+" "+m[i][3]);
        }
        System.out.println("Sum of the element in the major diagonal is: "+result);
    }
}
