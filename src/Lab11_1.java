import java.util.Scanner;

public class Lab11_1 {
    public static int[] merge(int[] list1, int[]list2){
        int[] list3 = new int[list1.length+list2.length];
        for (int i =0; i<list1.length; i++){
            list3[i] = list1[i];
        }
        for (int j=0; j<list2.length; j++){
            list3[list1.length+j]= list2[j];
        }
        for (int i = 0; i<list3.length; i++) {
            for (int j = 1; j<list3.length-i; j++) {
                if(list3[j-1] > list3[j]) {
                    int temp;
                    temp = list3[j-1];
                    list3[j-1] = list3[j];
                    list3[j] = temp;
                }
            }
        }

        return list3;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter list1 size and content ");
        String st1 = in.nextLine();
        String[] temp1 = st1.split(" ");
        int size1 = Integer.parseInt(temp1[0]) ;
        int[] list1=new int[size1];
        for(int i= 0; i< size1; i++ ){
            list1[i] = Integer.parseInt(temp1[i+1]);
        }
        System.out.println("Enter list2 size and content ");
        String st2 = in.nextLine();
        String[] temp2 = st2.split(" ");
        int size2 = Integer.parseInt(temp2[0]) ;
        int[] list2=new int[size2];
        for(int i= 0; i< size2; i++ ){
            list2[i] = Integer.parseInt(temp2[i+1]);
        }
        int[] fin = merge(list1, list2);
        System.out.print("The merged list is: ");
        for(int i =0; i<fin.length; i++){
            System.out.print(fin[i]+" ");
        }
    }
}
