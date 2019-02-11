import java.util.Scanner;

public class Homework1_1 {
   //111384808 Junjian Zhu
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,z;
        System.out.println("Please Enter the length of the first edge.");
        x = in.nextInt();
        System.out.println("Please Enter the length of the second edge.");
        y = in.nextInt();
        System.out.println("Please Enter the length of the third edge.");
        z = in.nextInt();
        if (((x+y)>z) & ((x+z)>y) & ((y+z)>x))
        {
            int p = x+y+z;
            System.out.println("We have a Triangle, and the perimeter is: "+p+".");
        }
        else
        {
            System.out.println("Error! We do not have a Triangle");
        }
    }


}
