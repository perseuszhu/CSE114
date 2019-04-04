package Lab16_2;

public class LinearEquation {
    private double a,b,c,d,e,f;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    public LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;

    }
    public boolean isSolvable(){
        a=getA();
        b=getB();
        c=getC();
        d=getD();
        boolean isTrue=false;
        if((a*d-b*c)!=0){
            isTrue=true;
        }
        return isTrue;
    }
    public double getX(){
        double x = 0;;
        boolean status=isSolvable();
        if(status){
            x=(e*d-b*f)/(a*d-b*c);
        }
        return x;
    }
    public double getY(){
        double y = 0;
        boolean status=isSolvable();
        if(status){
            y=(a*f-e*c)/(a*d-b*c);
        }
        return y;
    }
}
