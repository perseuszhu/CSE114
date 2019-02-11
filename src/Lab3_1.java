
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = Math.pow(b,2)-4*a*c;
        if(d>0){
            double dis = Math.sqrt(d);
            double r1 = (-b+dis)/(2*a);
            double r2 = (-b-dis)/(2*a);
            System.out.println("The Equation has two roots"+r1+"and"+r2);
        }
        else if(d==0){
            double dis = Math.sqrt(d);
            double r1 = (-b+dis)/(2*a);
            System.out.println("The Equation has one root"+r1);
        }
        else{
            System.out.println("The Equation does not have any root.");
        }
    }

}
