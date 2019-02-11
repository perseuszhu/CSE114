import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    StringBuffer text = new StringBuffer("The Quick Brown Fox Jumped over the Lazy Dog");
    System.out.println(text);
    System.out.println("What word would you like to append?");
    String word = in.nextLine();
    System.out.println("Where would you like to put this word?");
    int loc = in.nextInt();
    System.out.println(text.substring(0,loc) + word +" " + text.substring(loc));

    }
}
