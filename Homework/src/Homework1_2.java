
import java.util.Scanner;

public class Homework1_2 {
    //111384808 Junjian Zhu
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the letter.");
        String input = in.next();
        if (input.matches("[aeiouAEIOU]"))
            System.out.println(input + " is a vowel");
        else if (input.matches("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]"))
            System.out.println(input + " is a consonant");
        else
            System.out.println(input + " is a invalid input.");
    }
}