package Lab17_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 sides");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();
        boolean isfilled;
        Triangle t1 = new Triangle(side1, side2, side3 );
        double area = t1.getArea();
        double perimeter = t1.getPerimeter();
        System.out.println("Enter color: ");
        String color = in.next();
        t1.setColor(color);
        System.out.println("Enter true or false");
        String filled =in.next();
        if((filled.toLowerCase()).equals("true")){
            isfilled = true;
        }
        else
            isfilled=false;
        t1.setFilled(isfilled);
        System.out.println(t1.toString());
    }
}
