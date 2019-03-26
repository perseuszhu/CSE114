package Lab13_1;

public class Calc {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 4;
        rectangle1.width = 40;
        double a1 = rectangle1.getArea();
        double p1 = rectangle1.getPerimeter();
        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 3.5;
        rectangle2.width = 35.9;
        double a2 = rectangle2.getArea();
        double p2 = rectangle2.getPerimeter();
        System.out.println("The Rectangle with width of 4 and length of 40 have the area of "+ a1+" and the perimeter of "+ p1);
        System.out.println("The Rectangle with width of 3.5 and length of 35.9 have the area of "+ a2+" and the perimeter of "+ p2);
    }
}
