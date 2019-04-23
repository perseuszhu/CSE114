package Lab21_2;

import java.util.Scanner;

public class Lab21_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        toOctal(num);
    }

    public static void toOctal(int num){
        String octal = "";
        for(int i=0; i<8; i++) {
            if (num % 8 == 0) {
                octal = '0' + octal;
            } else {
                octal = (int) (num % 8) + octal;
                num = num / 8;
            }
        }
        for(int i=0; i<=octal.length(); i++) {
            if ((octal.charAt(0))=='0') {
                octal = octal.substring(1);
            }
        }
        System.out.println("Binary Value is: "+octal);
    }
}
