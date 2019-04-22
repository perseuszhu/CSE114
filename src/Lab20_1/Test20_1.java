package Lab20_1;

import java.util.Scanner;

import static Lab20_1.MyPoint.distance;

public class Test20_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinates for the first point: ");
        double ax = in.nextDouble();
        double ay = in.nextDouble();
        System.out.println("Enter the coordinates for the second point: ");
        double bx = in.nextDouble();
        double by = in.nextDouble();
        System.out.println("Enter the coordinates for the third point: ");
        double cx = in.nextDouble();
        double cy = in.nextDouble();
        MyPoint a = new MyPoint(ax, ay);
        MyPoint b = new MyPoint(bx, by);
        double distance = distance(a,b);
        double distance1 = a.distance(cx,cy);
        System.out.println("Enter the coordinates for the fourth point: ");
        double dx = in.nextDouble();
        double dy = in.nextDouble();
        MyPoint c = new MyPoint(dx, dy);
        double distance3 = a.distance(c);
        System.out.println("The distance between the first point and second point is: "+distance+" and the distance between the first point and the third point is: "+distance1+"plus distance3: "+distance3);
    }
}
