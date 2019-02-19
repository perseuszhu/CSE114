import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Factorial of a positive integer \uD835\uDC65 is defined as:"+"\n"+" \uD835\uDC39\uD835\uDC4E\uD835\uDC50\uD835\uDC61\uD835\uDC5C\uD835\uDC5F\uD835\uDC56\uD835\uDC4E\uD835\uDC59(\uD835\uDC65) = 1∗2∗3∗…∗(\uD835\uDC65−1)∗\uD835\uDC65");
        System.out.println("Please enter a Integer");
        int n = in.nextInt();
        int factor = 1;
        for ( int i=1; i<=n; i++)
        {
            factor = factor*i;
        }
        System.out.println(factor);

    }
    }
