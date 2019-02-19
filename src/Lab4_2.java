import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Please Enter an Integer: ");
    int num = in.nextInt();
    if(num%5==0||num%6==0){
        boolean status;
        boolean status2;
        if(num%5==0&&num%6==0){
                status = true;
                status2 = false;
                System.out.println("Is "+num+" divisible by 5 and 6 ? "+status+"\n" +
                        "Is "+num+" divisible by 5 or 6 ? "+status+"\n" +
                        "Is "+num+" divisible by 5 or 6, but not both ? "+status2);
        }
        else{
                status = false;
                status2 = true;
                System.out.println("Is "+num+" divisible by 5 and 6 ? "+status+"\n" +
                        "Is "+num+" divisible by 5 or 6 ? true\n" +
                        "Is "+num+" divisible by 5 or 6, but not both ? "+status2);
        }
    }
        else{
            System.out.println(num+" is not divisible by neither 5 nor 6");
        }
    }


}

