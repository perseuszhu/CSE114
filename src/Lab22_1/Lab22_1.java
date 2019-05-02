package Lab22_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab22_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int num1 = 0;
        int num2 = 0;
        boolean isTrue = false;
        while (!isTrue) {
            try {
                num1 = in.nextInt();
                num2 = in.nextInt();
                isTrue = true;
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Invalid input" );
                System.out.print("Enter two integers: ");
            }
        }
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
