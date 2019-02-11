import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double w = in.nextDouble();
        if (w > 0 && w <= 1) {
            double cost = 3.5 * w;
            System.out.println("The shipping fee for "+w+" pounds is "+cost);
        } else if (w > 1 && w <= 3) {
            double cost = 5.5 * w;
            System.out.println("The shipping fee for "+w+" pounds is "+cost);
        } else if (w > 3 && w <= 10) {
            double cost = 8.5 * w;
            System.out.println("The shipping fee for "+w+" pounds is "+cost);
        } else if (w > 10 && w <= 20) {
            double cost = 10.5 * w;
            System.out.println("The shipping fee for "+w+" pounds is "+cost);
        }
        else if (w>20){
            System.out.println("The Package cannot be Shipped.");
        }
        if(w<=0) {
            System.out.println("Invalid Input.");
        }

    }
}
