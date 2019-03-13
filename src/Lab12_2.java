import java.util.Scanner;

public class Lab12_2 {
    public static boolean isMarkovMatrix(double[][] m) {
        boolean isM;
        double s1 = 0;
        double s2 = 0;
        double s3 = 0;
        for (int i = 0; i < 3; i++) {
            s1 += m[i][0];
        }
        for (int i = 0; i < 3; i++) {
            s2 += m[i][1];
        }
        for (int i = 0; i < 3; i++) {
            s3 += m[i][2];
        }
        if (s1 == 1.0 && s2 == 1.0 && s3 == 1.0) {
            isM = true;
        }
        else
            isM=false;
        return isM;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix array: ");
        double[][] a = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = in.nextDouble();
            }
        }
        boolean isMarkov = isMarkovMatrix(a);
        if (isMarkov == true)
            System.out.println("It is a Markov Matrix");
        else
            System.out.println("It is not a Markov Matrix");
    }
}
