package Lab20_2;

import java.util.ArrayList;

public class Test20_2 {
    public static void main(String[] args){
        ArrayList<Integer> grade = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            grade.add(10*i);
        }
        ArrayList<Character> LG = new ArrayList<Character>();
        LG = Grade.letterGrade(grade);
        for(int i=0; i<LG.size(); i++){
            System.out.print(LG.get(i)+" ");
        }
    }
}
