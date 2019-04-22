package Homework4_1;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test4_1 {
    public static void main(String[] args) throws IOException {
        MyFile file = new MyFile();
        file.createFile("File");
        String result = file.readFile("File");
        String[] result1 = result.split(" ");
        ArrayList<Integer> resultInt = new ArrayList<Integer>();
        for(int i=0; i<result1.length; i++){
            resultInt.add(Integer.parseInt(result1[i]));
        }
        Collections.sort(resultInt);
        for(int i=0; i<resultInt.size(); i++){
            System.out.print(resultInt.get(i)+", ");
        }

    }
}
