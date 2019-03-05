import java.util.Scanner;

public class Lab9_2 {
    public static double mi(int x) {
        double m = 0;
        for (int i = 1; i <= x; i++) {
            m+=((double)i/(i+1));
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Numbers would you like to calculate: ");
        int j = in.nextInt();
        System.out.println("i"+"        "+"m(i)");
        for(int i = 1; i<=j; i++){
            System.out.println(i+"        "+mi(i));
        }

    }
}
