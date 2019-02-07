import java.util.Scanner;

public class Testreplace {
    public static void main(String[] args){
        StringBuffer text = new StringBuffer("Lazy Dog");
        System.out.println(text);
        Scanner in = new Scanner(System.in);
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
