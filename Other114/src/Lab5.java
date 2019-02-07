import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuffer text = new StringBuffer("The Quick Brown Fox Jumped over the Lazy dog.");
        System.out.println(text);
        System.out.println("What would you like to replace");
        String word = in.nextLine();
        System.out.println("What is the new word?");
        String nw = in.nextLine();
        int start = text.indexOf(word);
        int end = start+word.length();
        text.replace(start,end,nw);
        System.out.println(text);
    }
}
