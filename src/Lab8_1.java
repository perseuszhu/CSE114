import java.util.Scanner;

public class Lab8_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Phone Number: ");
        String num =in.nextLine();
        System.out.println("("+num.substring(0,3)+")"+num.substring(3,6)+"-"+num.substring(6));

    }
}
