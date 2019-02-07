import java.util.Scanner;

public class Lab2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How much are you paid Per Hour");
        Double amount = in.nextDouble();
        System.out.println("If you work 40 hour/week for all 52 weeks you should earn " + (int)(amount*40*52) + " This year.");


    }


}
