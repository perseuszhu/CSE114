package Lab18_2;


import java.util.ArrayList;
import java.util.Scanner;

public class Lab18_2 {
    public static ArrayList<Integer> union (ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = (ArrayList<Integer>) list1.clone();
        list.addAll(list2);
        return list;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter five Integers for list1: ");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(in.nextInt());
        list1.add(in.nextInt());
        list1.add(in.nextInt());
        list1.add(in.nextInt());
        list1.add(in.nextInt());
        System.out.print("Enter five Integers for list2: ");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(in.nextInt());
        list2.add(in.nextInt());
        list2.add(in.nextInt());
        list2.add(in.nextInt());
        list2.add(in.nextInt());
        ArrayList<Integer> fin = union(list1,list2);
        System.out.print("The combinedlist is: ");
        for(int i=0; i<fin.size(); i++){
            System.out.print(fin.get(i)+" ");

        }
    }
}
