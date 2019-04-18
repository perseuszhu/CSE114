package Lab20_2;

import java.util.ArrayList;

public class Grade {
    public static ArrayList<Character> letterGrade (ArrayList<Integer> grade){
        ArrayList<Character> LG = new ArrayList<Character>();
        for(int i=0; i<grade.size(); i++){
            if(grade.get(i)>=90){
                LG.add('A');
            }
            else if(grade.get(i)>=80 && grade.get(i)<90){
                LG.add('B');
            }
            else if(grade.get(i)>=70 && grade.get(i)<80){
                LG.add('C');
            }
            else if(grade.get(i)>=60 && grade.get(i)<70){
                LG.add('D');
            }
            else
                LG.add('F');
        }
        return LG;
    }
}
