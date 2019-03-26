import java.util.Scanner;

public class Homework2_4 {

    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] result = new double[3][3];
        for (int i=0; i<3; i++){
            for(int j =0;j<3; j++){
                result[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Matrix 1: ");
        double[][]a = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = in.nextDouble();
            }
        }
        System.out.println("Enter Matrix 2: ");
        double[][]b = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = in.nextDouble();
            }
        }
        double[][] result = multiplyMatrix(a,b);
        System.out.println("Multiplication of the Matricies is :");
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print((String.format("%.1f",result[i][j]))+"  ");
            }
        }

    }
}
//Enter matrix1: 1 2 3 4 5 6 7 8 9
//Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2