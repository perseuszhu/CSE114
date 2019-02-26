import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Lab7_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> city = new ArrayList<String>();
        System.out.println("Enter the First City: ");
        city.add(in.nextLine());
        System.out.println("Enter the Second City: ");
        city.add(in.nextLine());
        System.out.println("Enter the Third City: ");
        city.add(in.nextLine());
        city.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                String s1 = o1.toLowerCase();
                String s2 = o2.toLowerCase();
                return s1.compareTo(s2);
            }
        });
        System.out.println("The three cities in alphabetical order are: "+ city);
    }
}








