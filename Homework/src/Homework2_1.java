import java.util.Scanner;

public class Homework2_1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the input String: ");
        String line = in.nextLine();
        String lineLow = line.toLowerCase();
        boolean checkA;
        checkA = check(lineLow);
         if(checkA==true)
            System.out.println(line+" is a palindrome");
        else
            System.out.println(line+" is not a palindrome");
    }
    public static boolean check (String lineLow){
        boolean status = false;
        String[] st1 = lineLow.split("");
        StringBuffer st2= new StringBuffer();
        for (int i = 0; i<st1.length; i++){
            if(!st1[i].equals(" "))
                st2.append(st1[i]);
        }
        String st3=st2.toString();
        int l = st3.length();
        if(l==1)
            status = true;
        for (int i = 0; i<l/2; i++){
            if(st3.charAt(i)==st3.charAt((l-1-i))){
                status = true;
            }
            else{
                status = false;
            }
        }
        return status;
    }

}
