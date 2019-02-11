import java.util.Scanner;

public class Homework1_3 {
    // 111384808 Junjian Zhu
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the Text.");
        String input = in.nextLine();
        int vowcnt = 0;
        int concnt = 0;
        for (int i = 0; i<input.length(); i++){
            String temp = String.valueOf(input.charAt(i));
            if(temp.matches("[aeiouAEIOU]"))
                vowcnt++;
            }
        for (int i = 0; i<input.length(); i++){
            String temp = String.valueOf(input.charAt(i));
            if(temp.matches("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]"))
                concnt++;
        }
        System.out.println("The Number of Vowels is: "+ vowcnt);
        System.out.println("The Number of Consonant is: "+ concnt);
        }

    }
