package Lab14_1;

import java.util.Scanner;


public class Run {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r1=0;
        double r2=0;
        System.out.println("Enter a, b, c ∶");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        QuadraticEquation coe = new QuadraticEquation(a,b,c);
        double dis = coe.getDiscriminant();
        if(dis>0){
            r1 = coe.getRoot1();
            r2 = coe.getRoot2();
            System.out.println("The equation has two roots: "+r1+" and "+r2+" .");
        }
        else if(dis==0){
            r1=coe.getRoot1();
            System.out.println("The equation has one root: "+r1+" .");
        }
        else
            System.out.println("The equation has no real roots. ");


    }
}
