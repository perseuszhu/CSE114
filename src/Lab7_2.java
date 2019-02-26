import java.util.ArrayList;

public class Lab7_2 {
    public static void main(String[] args){
       String[] plate = new String[7];
       for(int i =0; i<3; i++)
       {
           plate[i] = String.valueOf((char)(Math.random()*26+65));
       }
       for(int i = 3; i<7; i++){
           plate[i] = String.valueOf((int)(Math.random()*10));
       }
       for(int i =0; i<plate.length; i++){
           System.out.print(plate[i]);
       }

    }
}
