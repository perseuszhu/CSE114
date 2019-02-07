import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Initial Velocity");
        double v0 = in.nextDouble();
        System.out.println("Please enter the Ending Velovity");
        double v1 = in.nextDouble();
        System.out.println("Please enter the Time Span");
        double t = in.nextDouble();
        double a;
        if (t==0){
            System.out.println("Error! Time span Cannot be Zero");
        }
        else{
            a = (v1-v0)/t;
            System.out.println("The acceleration is: "+a+".");
        }

    }
}
