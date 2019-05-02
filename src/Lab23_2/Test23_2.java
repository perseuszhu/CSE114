package Lab23_2;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test23_2 {
    public static void main(String[] args) throws IOException {
        Lab23_2 file = new Lab23_2();
        file.createFile("File");
        String result = file.readFile("File");
        String[] result1 = result.split(" ");
        String temp = null;
            for (int i = 0; i < result1.length/2; i++) {
                temp = result1[i];
                result1[i] = result1[result1.length - i-1];
                result1[result1.length - i-1] = temp;
            }

        for(int i=0; i<result1.length; i++){
            System.out.print(result1[i]+", ");
        }

    }
}