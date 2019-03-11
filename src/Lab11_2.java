import java.util.Scanner;

public class Lab11_2 {
    public static int[] reverse(int[] x){
        for(int i =0; i< x.length/2; i++){
            int temp;
            temp = x[i];
            x[i]=x[x.length-i-1];
            x[x.length-i-1]= temp;

        }
        return x;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] init = new int[10];
        for(int i =0; i<10; i++){
            init[i]= in.nextInt();
        }
        int[] fin = reverse(init);
        for ( int i = 0 ;i< fin.length; i++){
            System.out.print(fin[i]+" ");
        }
    }

}
