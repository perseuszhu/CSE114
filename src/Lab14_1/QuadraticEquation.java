package Lab14_1;

public class QuadraticEquation {
    private  double a,b,c;

    public QuadraticEquation(double a, double b, double c ){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public  double getA() {
        return a;
    }

    public  double getB() {
        return b;
    }

    public  double getC() {
        return c;
    }
    public  double getDiscriminant(){
        double x = 0;
        x=Math.pow(this.b,2)-4*this.a*this.c;
        return x;
    }
    public  double getRoot1(){
        double r1=0;
            r1=(-b+Math.pow((Math.pow(b,2))-4*a*c,0.5))/(2*a);
        return r1;
    }

    public  double getRoot2(){
        double r2=0;
            r2=(-b-Math.pow((Math.pow(b,2))-4*a*c,0.5))/(2*a);
        return r2;
    }
}
