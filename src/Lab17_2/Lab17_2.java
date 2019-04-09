package Lab17_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab17_2 {
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> chars = new ArrayList();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        return chars;
    }

        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input String: ");
        String input = in.nextLine();
        ArrayList<Character> chars = toCharacterArray(input);
        System.out.print("Element of Character Array list: ");
        for(int i=0; i<chars.size(); i++){
            System.out.print(chars.get(i)+" ");

        }
        }
}
