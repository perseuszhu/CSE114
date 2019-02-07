import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuffer text = new StringBuffer("The quick brown fox jumped over the lazy dog.");
        System.out.println(text);
        System.out.println("What text do you like to append?");
        String info = in.nextLine();
        System.out.println(text.append(info));

    }
}
