import java.util.Scanner;

public class Lab10_1 {
    public static double mean(double[] x){
        double mean = 0;
        double total =0;
        for(int i = 0 ; i<x.length; i++){
            total+= x[i];
        }
        mean = total/x.length;
        return mean;
    }

    public static double deviation(double[]x){
        double m = mean(x);
        double sum = 0;
        for(int i =0; i<x.length; i++){
            sum+=Math.pow((x[i]-m),2);
        }
        double de = Math.sqrt(sum/(double)(x.length-1));
        return de;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the 10 numbers.");
        double[] y = new double[10];
        for(int i = 0; i<y.length; i++){
            y[i] = in.nextDouble();
        }
        System.out.println("The mean of the data is: "+(String.format("%.2f",mean(y)))+"and the Standard deviation of the Data is: "+String.format("%.5f",deviation(y)));
    }
}
