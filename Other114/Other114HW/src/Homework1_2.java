import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Coordinates:");
        String geo = in.nextLine();
        for(int i = 0; i<geo.length(); i++){
            int loc = geo.indexOf(" ");
            String sym = "abc";
            System.out.print(geo.substring(0,loc)+sym.substring(i,i+1)+"\n");
            geo = geo.substring(loc+1);

        }
        System.out.println(geo);
    }
}
