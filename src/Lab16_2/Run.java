package Lab16_2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a= in.nextDouble();
        double b= in.nextDouble();
        double c= in.nextDouble();
        double d= in.nextDouble();
        double e= in.nextDouble();
        double f= in.nextDouble();
        LinearEquation equ = new LinearEquation(a,b,c,d,e,f);
        double x = equ.getX();
        double y = equ.getY();
        boolean status = equ.isSolvable();
        if(status==false){
            System.out.println("The Equation has no Solutions. ");
        }
        else{
            System.out.println("X is: "+ x+" and Y is: "+y);
        }
    }
}
