package Lab13_1;



public class Rectangle {
    double width;
    double length;

    public Rectangle(){

    }
    public Rectangle(double w, double l){
            this.width=w;
            this.length=l;
    }
    public  double getArea(){
        double area = width*length;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*(width+length);
        return perimeter;
    }

}
