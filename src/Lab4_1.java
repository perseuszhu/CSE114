import java.util.Scanner;

public class Lab4_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a 3-digit integer.");
        int num1 = in.nextInt();
        int num = num1;
        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;

        int num2 = 100 * a + 10 * b + num;
        if(num1==num2)
            System.out.println(num1+" is a palindrome");
        else
            System.out.println(num1+" isn't a palindrome");
        }

    }

