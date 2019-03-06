import java.util.Scanner;

public class test {

        public static void main(String[] args) {
            Double side;	// length of a side in the hexagon
            Double area;	// the area of a hexagon

            // query the user for the length of the sides in the hexagon
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the side: ");
            side = input.nextDouble();

            // calculate the area of the hexagon using the formula provided in the
            // exercise instructions
            area = (6 * side * side ) / ( 4 * Math.tan(Math.PI/6));

            // print the results of the calculation
            System.out.printf("The area of the hexagon is %.2f", area);
        }

    }
