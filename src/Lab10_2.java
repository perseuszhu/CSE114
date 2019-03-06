import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab10_2 {

    public static int[] eliminateDuplicate(int[] list){
            List<Integer> x = new ArrayList<Integer>();
            for(int i = 0; i<list.length; i++) {
                if (!x.contains(list[i])) {
                    x.add(list[i]);
                }
            }
            int[] list1 = new int[x.size()];
            for(int j =0; j<list1.length; j++){
                list1[j] = x.get(j);
            }
        return list1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the 10 numbers.");
        int [] y = new int[10];
        for(int i = 0; i<y.length; i++){
            y[i] = in.nextInt();
        }
        int[] result = eliminateDuplicate(y);
        System.out.print("The distinct numbers are: ");
        for(int j =0; j<result.length; j++){
            System.out.print(result[j]+" ");
        }

    }
}
