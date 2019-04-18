package Homework3_Rational;

import java.util.Scanner;

public class Rational {
    private int n,d;

    public Rational(int n,int d,int maxCommonFactor){
        this.n = n/maxCommonFactor;
        this.d = d/maxCommonFactor;
    }

    public Rational(){
    }

    public void setD(int d) {
        this.d = d;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    public int getD() {
        return d;
    }

    public static int maxCommonFactor(int n, int d){
        int maxCommonFactor =1;
        int smaller = n > d ? d : n;
        for(int i=1; i<=smaller; i++){
            if(n % i==0 && d % i==0){
                maxCommonFactor = i;
            }
        }
        return maxCommonFactor;
        }
        public static Rational addition(Rational fraction1, Rational fraction2){
        int fn = fraction1.getN();
        int fd = fraction1.getD();
        int sn = fraction2.getN();
        int sd = fraction2.getD();
        int n;
        int d;
        if(fd==sd){
            d=sd;
            n=fn+sn;
        }
        else{
            d=fd*sd;
            n=fn*sd+sn*fd;
        }
        int f1 = maxCommonFactor(n,d);
        Rational sum = new Rational(n,d,f1);
        return sum;
        }
        public static Rational subtraction(Rational fraction1, Rational fraction2){
            int fn = fraction1.getN();
            int fd = fraction1.getD();
            int sn = fraction2.getN();
            int sd = fraction2.getD();
            int n;
            int d;
            if(fd==sd){
                d=sd;
                n=fn-sn;
            }
            else{
                d=fd*sd;
                n=fn*sd-sn*fd;
            }
            int f1 = maxCommonFactor(n,d);
            Rational diff = new Rational(n,d,f1);
            return diff;
        }
    public static Rational multiplicationDivision(Rational fraction1, Rational fraction2,boolean status){
        int fn = fraction1.getN();
        int fd = fraction1.getD();
        int sn = fraction2.getN();
        int sd = fraction2.getD();
        int n;
        int d;
        if(status) {
            n = fn * sn;
            d = fd * sd;
        }
        else{
            n=fn*sd;
            d=fd*sn;
        }
        int f1 = maxCommonFactor(n,d);
        Rational product = new Rational(n,d,f1);
        return product;
    }
   /* public static Rational division(Rational fraction1, Rational fraction2){
        int fn = fraction1.getN();
        int fd = fraction1.getD();
        int sn = fraction2.getN();
        int sd = fraction2.getD();
        int n;
        int d;
        n=fn*sd;
        d=fd*sn;
        int f1 = maxCommonFactor(n,d);
        Rational quotient  = new Rational(n,d,f1);
        return quotient;
    }*/


        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numerator for the first rational number: ");
        int fn = in.nextInt();
        System.out.println("Enter a non-zero denominator for the first rational number: ");
        int fd = in.nextInt();
        System.out.println("Enter numerator for the second rational number: ");
        int sn = in.nextInt();
        System.out.println("Enter a non-zero denominator for the second rational number: ");
        int sd = in.nextInt();
        int d1 = maxCommonFactor(fn,fd);
        int d2 = maxCommonFactor(sn,sd);
        Rational fraction1 = new Rational(fn,fd,d1);
        Rational fraction2 = new Rational(sn,sd,d2);
        fn=fraction1.getN();
        fd=fraction1.getD();
        sn=fraction2.getN();
        sd=fraction2.getD();
        System.out.println("First rational number is: "+fn+"/"+fd);
        System.out.println("Second rational number is: "+sn+"/"+sd);
        Rational sum = addition(fraction1,fraction2);
        int sumN  = sum.getN();
        int sumD = sum.getD();
        System.out.println("Addition of the rational numbers is: "+sumN+"/"+sumD);
        Rational diff = subtraction(fraction1,fraction2);
        int diffN  = diff.getN();
        int diffD = diff.getD();
        System.out.println("Subtraction of the rational numbers is: "+diffN+"/"+diffD);
        Rational product = multiplicationDivision(fraction1,fraction2,true);
        int ProdN  = product.getN();
        int ProdD = product.getD();
        System.out.println("Multiplication of the rational numbers is: "+ProdN+"/"+ProdD);
        Rational quotient = multiplicationDivision(fraction1,fraction2,false);
        int QuotN  = quotient.getN();
        int QuotD = quotient.getD();
        System.out.println("Division of the rational numbers is: "+QuotN+"/"+QuotD);


        }
}

