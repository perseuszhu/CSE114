import java.util.Scanner;

public class Lab12_1 {
    public static int[] locateLargest(double[][] a) {
        int[] loc = new int[2];
        double[] tot;
        int len =0;
        for(double [] element : a){
            len += element.length;
        }
        tot = new double[len];
        int num = 0;
        for(double[] element : a){
            for(double element2 : element){
            tot[num++]= element2;
            }
        }
        for (int i = 0; i<tot.length; i++) {
            for (int j = 1; j<tot.length-i; j++) {
                if(tot[j-1] > tot[j]) {
                    double temp;
                    temp = tot[j-1];
                    tot[j-1] = tot[j];
                    tot[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (tot[tot.length-1] == a[i][j]) {
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }
        return loc;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int r = in.nextInt();
        int c = in.nextInt();
        System.out.println("Enter the array: ");
        double[][] a = new double[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextDouble();
            }
        }
        int[] loc = locateLargest(a);
        System.out.println("The location of the largest element is at: ("+loc[0]+", "+loc[1]+")");
    }
}

