import java.util.Scanner;

public class Homework1_4 {
    // 111384808 Junjian Zhu
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the Text.");
        String input = in.nextLine();
        int UPcnt = 0;
        for (int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c>=65&&c<=90)
                UPcnt++;
        }
        System.out.println("The Number of Uppercase Letter is: "+ UPcnt);
    }
}
