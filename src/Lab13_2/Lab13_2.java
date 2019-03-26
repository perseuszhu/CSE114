package Lab13_2;

import java.util.Random;

public class Lab13_2 {
    public static void main(String[] args){
        int[] Random =Rand();
        for(int i =0; i<Random.length; i++){
            System.out.print(Random[i]+" , ");
        }
        int[] cnt = new int[10];

        for(int i =0; i<Random.length; i++){
            switch(Random[i]){
                case 0:
                    cnt[0]++;
                    break;
                case 1:
                    cnt[1]++;
                    break;
                case 2:
                    cnt[2]++;
                    break;
                case 3:
                    cnt[3]++;
                    break;
                case 4:
                    cnt[4]++;
                    break;
                case 5:
                    cnt[5]++;
                    break;
                case 6:
                    cnt[6]++;
                    break;
                case 7:
                    cnt[7]++;
                    break;
                case 8:
                    cnt[8]++;
                    break;
                case 9:
                    cnt[9]++;
                    break;

            }
        }
        System.out.println("The number "+0+" has appeared "+cnt[0]+" times");
        for(int i=0;i<cnt.length;i++){
            System.out.println("The number "+i+" has appeared "+cnt[i]+" times");
        }

    }


    public static int[] Rand(){
        int[]x = new int[100];
        Random random = new Random();
        for(int i =0; i<x.length; i++){
            x[i] =random.nextInt(10);
        }
        return x;
    }
}
