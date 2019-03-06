import java.util.Scanner;

public class Homework2_3 {
    public static String[] sort(String[] s){
        for(int i =0; i<s.length; i++){
            for (int j = 1; j < s.length - i; j++) {
                if (s[j - 1].compareToIgnoreCase(s[j])>0 ) {
                    String temp;
                    temp = s[j - 1];
                    s[j - 1] = s[j];
                    s[j] =  temp;
                }
            }
        }
        return s;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] s1 = s.split(", ");
        System.out.println("The sorted Cities are: ");
        for(int i =0; i<s1.length; i++){
            System.out.print(s1[i]+", ");
        }


    }

}



