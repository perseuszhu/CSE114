package Lab15_2;

public class RegularPolygon {
    private int n = 3;              //#of sides in the polygon with default value 3
    private double side = 1;        //length of the side with default value 1
    private double x = 0;           //defines the x-coordinate of the polygon’s center with default value 0.
    private double y = 0;           //defines the y-coordinate of the polygon’s center with default value 0.

    public RegularPolygon(){
        }

    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public int getN() {
        return n;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
    }

}

