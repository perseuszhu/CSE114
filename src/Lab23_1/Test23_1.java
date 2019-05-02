package Lab23_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test23_1 {
    public static void main(String[] args) throws IOException {
        Lab23_1 file = new Lab23_1();
        file.createFile("File");
        String result = file.readFile("File");
        String[] result1 = result.split(" ");
        ArrayList<Integer> resultInt = new ArrayList<Integer>();
        for(int i=0; i<result1.length; i++){
            resultInt.add(Integer.parseInt(result1[i]));
        }
        int total = 0;
        for(int i=0; i<resultInt.size(); i++){
            total+= resultInt.get(i);
        }
        double average = total/resultInt.size();
        Collections.sort(resultInt);
        for(int i=0; i<resultInt.size(); i++){
            System.out.print(resultInt.get(i)+", ");
        }
        System.out.println();
        System.out.println("The Total of the score is: "+total+" and the average is: "+average+".");

    }
}
