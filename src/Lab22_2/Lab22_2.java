package Lab22_2;

import java.util.Random;
import java.util.Scanner;

public class Lab22_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the index");

        int[] arr = new int[100];
        Random r = new Random();
        for(int i=0; i<100; i++){
            arr[i] = r.nextInt(101);
        }
        boolean isTrue = false;
        while(!isTrue){
            try{
                int index = in.nextInt();
                System.out.println(arr[index]);
                isTrue = true;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of bound.");
                System.out.println("Enter the index");
            }
        }
    }
}
