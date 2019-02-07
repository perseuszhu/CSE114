import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Your Name (Last, First):");
        String name = in.nextLine();
        int loc = name.indexOf(",");
        System.out.println(name.substring(loc+1) +","+  name.substring(0, loc));
            }
        }

