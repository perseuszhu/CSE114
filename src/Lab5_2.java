import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int s = in.nextInt();
        System.out.println("Enter the side: ");
        double l = in.nextDouble();
        double a = (s*Math.pow(l,2))/(4*Math.tan(Math.PI/s));
        System.out.println("The are of the polygon is: "+a);
    }
}
