import java.util.Scanner;

public class Lab9_1 {
    public static int count(String str, char a){
        int cnt=0;
        str = str.toLowerCase();
        char z = Character.toLowerCase(a);
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)==z)
                cnt++;
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the String and the character.");
        String s = in.nextLine();
        String [] a = s.split(" ");
        String y = a[0];
        String z = a[1];
        char x = z.charAt(0);
        int cnt = count(y,x);
        System.out.println(cnt);
    }
}
