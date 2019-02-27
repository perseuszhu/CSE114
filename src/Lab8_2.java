import java.util.Scanner;

public class Lab8_2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter:");
        String st1 = in.nextLine();
        for(int i =0; i<st1.length(); i++){
            if(i%2==0){
                System.out.print(st1.charAt(i));
            }
        }
    }
}
