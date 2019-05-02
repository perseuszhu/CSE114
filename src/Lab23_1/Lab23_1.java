package Lab23_1;

import java.io.*;
import java.nio.Buffer;
import java.util.Random;

public class Lab23_1{
    private static String path = "E:/";
    private static String filenameTemp;


    public static boolean createFile(String name) throws IOException {
        boolean status = false;
        Random r = new Random();
        filenameTemp = path + name +".txt";
        File filename = new File(filenameTemp);
        try{
            if(!filename.exists()){
                filename.createNewFile();
            }
            else{
                filename.delete();
                filename.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(filenameTemp));
            for(int i=0; i<100; i++){
                bw.write(r.nextInt(101)+" ");
            }

            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        status = true;
        return status;
    }

    public static String readFile(String name) throws IOException{
        filenameTemp = path + name + ".txt";
        File file = new File(filenameTemp);
        String result = "";
        String thisLine = null;
        if (file.exists() && file.isFile()) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filenameTemp)));
                while ((thisLine = br.readLine()) != null) {
                    result += thisLine;
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}
