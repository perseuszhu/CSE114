package Lab20_1;

public class MyPoint {
    private double x;
    private double y;
    public MyPoint(){
    }

    public MyPoint(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double distance(MyPoint a, MyPoint b){
        double dis;
        dis = Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
        return dis;
    }
    public double distance( Double x, Double y){
        double dis;
        dis = Math.sqrt(Math.pow(this.getX()-x,2)+Math.pow(this.getY()-y,2));
        return dis;
    }
    public double distance(MyPoint a){
        double dis;
        dis = Math.sqrt(Math.pow(this.getX()-a.getX(),2)+Math.pow(this.getY()-a.getY(),2));
        return dis;
    }

}
