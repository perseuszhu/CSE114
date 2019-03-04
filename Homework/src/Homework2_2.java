import java.util.Arrays;
import java.util.Scanner;

public class Homework2_2 {

    public static String st5(String st1) {
        String st6 = st1.toLowerCase();
        String[] st3 = st6.split("");
        StringBuffer st4 = new StringBuffer();
        for (int i = 0; i < st3.length; i++) {
            if (!st3[i].equals(" "))
                st4.append(st3[i]);
        }
        String st5 = st4.toString();

        return st5;
    }

    public static String bbs(String st) {
        char[] arr = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            arr[i] = st.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp;
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = (char) temp;
                }
            }
        }
        String result = "";
        for (int x = 0; x<arr.length ; x++) {

            result += String.valueOf(arr[x]);
        }
        /*StringBuilder sb = new StringBuilder();
        while (true){
            for(int i = 0; i<st.length(); i++){
                arr[i] = st.charAt(i);
            }
            Arrays.sort(arr);
            for(int i = 0; i<st.length(); i++){
                sb.append(arr[i]);
            }
            String fin = sb.toString().trim();
            return fin;
        }*/

    return result;
    }


    public static boolean check(String st1, String st2){
        boolean status = false;
        if (st1.contains(st2)) {
            status = true;
        }
        return status;
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the first String: ");
        String st1 = in.nextLine();
        System.out.println("Please Enter the second String: ");
        String st2 = in.nextLine();
        String nsst1 =st5(st1);
        String nsst2 =st5(st2);
        String fin1 = bbs(nsst1);
        String fin2 = bbs(nsst2);
        boolean checkA = check(fin1,fin2);
        if(checkA){
            System.out.println(st1+" and "+st2+" are anagrams.");
        }
        else{
            System.out.println(st1+" and "+st2+" are NOT anagrams.");
        }
}



}
