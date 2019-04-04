package Lab15_2;

public class Run2 {
    public static void main(String[] args){
        RegularPolygon defa = new RegularPolygon();
        RegularPolygon ns = new RegularPolygon(6,4);
        RegularPolygon nsxy = new RegularPolygon(10,4,5.6,7.8);
        double defap = defa.getPerimeter();
        double defaa = defa.getArea();
        double nsp = ns.getPerimeter();
        double nsa = ns.getArea();
        double nsxyp = nsxy.getPerimeter();
        double nsxya = nsxy.getArea();
        System.out.println("Regular Polygon Default has perimeter: "+defap+" and area of "+defaa+".");
        System.out.println("Regular Polygon (6.4) has perimeter: "+nsp+" and area of "+nsa+".");
        System.out.println("Regular Polygon (10, 4, 5.6, 7.8) has perimeter: "+nsxyp+" and area of "+nsxya+".");

    }
}
