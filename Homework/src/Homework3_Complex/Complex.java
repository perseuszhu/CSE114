package Homework3_Complex;

import java.util.Scanner;

public class Complex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter real part of the first complex number: ");
        double r1 = in.nextDouble();
        System.out.println("Enter imaginary part of the first complex number: ");
        double i1 = in.nextDouble();
        System.out.println("Enter real part of the second complex number: ");
        double r2 = in.nextDouble();
        System.out.println("Enter imaginary part of the first complex number: ");
        double i2 = in.nextDouble();
        Complex com = new Complex(r1,r2,i1,i2);
        double rs = com.getRealSum();
        double rd = com.getRealDif();
        double is = com.getImagineSum();
        double id = com.getImagineDIf();
        System.out.println("First complex number is: ("+r1+", "+i1+")");
        System.out.println("Second complex number is: ("+r2+", "+i2+")");
        System.out.println("Addition of the complex numbers is: ("+rs+", "+is+")");
        System.out.println("Subtraction of the complex numbers is: ("+rd+", "+id+")");
    }
    private double r1,r2,i1,i2;

    private Complex(double r1,double r2,double i1,double i2){
        this.i1 = i1;
        this.i2 = i2;
        this.r1 = r1;
        this.r2 = r2;
    }
    public Complex(){

    }


    private double getI1() {
        return i1;
    }

    private double getI2() {
        return i2;
    }

    private double getR1() {
        return r1;
    }

    private double getR2() {
        return r2;
    }

    private double getRealSum(){
        return getR1()+getR2();
    }
    private double getRealDif(){
        return getR1()-getR2();
    }
    private double getImagineSum(){
        return getI1()+getI2();
    }
    private double getImagineDIf(){
        return getI1()-getI2();
    }
}
