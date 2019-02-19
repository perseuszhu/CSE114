import java.util.Scanner;

public class Homework1_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("****Hi, Welcome to Junjian Zhu's Distance Calculator**** ");
        System.out.println("Enter Data for the Starting City:");
        System.out.println("Please Enter you Starting City:");
        String start = in.nextLine();
        System.out.println("Please Enter you Starting City's Latitude Degrees:");
        int slad = in.nextInt();
        System.out.println("Please Enter you Starting City's Latitude Minutes:");
        int slam = in.nextInt();
        System.out.println("Please Enter you Starting City's Latitude Seconds:");
        int slas = in.nextInt();
        System.out.println("Please Enter you Starting City's Longitude Degrees:");
        int slod = in.nextInt();
        System.out.println("Please Enter you Starting City's Longitude Minutes:");
        int slom = in.nextInt();
        System.out.println("Please Enter you Starting City's Longitude Seconds:");
        int slos = in.nextInt();

        System.out.println("Enter Data for the Destination City:");
        System.out.println("Please Enter you Destination City:");
        String dest = in.next();
        System.out.println("Please Enter you Destination City's Latitude Degrees:");
        int dlad = in.nextInt();
        System.out.println("Please Enter you Destination City's Latitude Minutes:");
        int dlam = in.nextInt();
        System.out.println("Please Enter you Destination City's Latitude Seconds:");
        int dlas = in.nextInt();
        System.out.println("Please Enter you Destination City's Longitude Degrees:");
        int dlod = in.nextInt();
        System.out.println("Please Enter you Destination City's Longitude Minutes:");
        int dlom = in.nextInt();
        System.out.println("Please Enter you Destination City's Longitude Seconds:");
        int dlos = in.nextInt();
        double sla1 = (slad+(slam/60)+(slas/3600));
        double sla2 = (dlad+(dlam/60)+(dlas/3600));
        double slo1 = (slod+(slom/60)+(slos/3600));
        double slo2 = (dlod+(dlom/60)+(dlos/3600));
        double x = (Math.sin(sla1/(180/Math.PI))*Math.sin(sla2/(180/Math.PI)))+(Math.cos(sla1/(180/Math.PI))*Math.cos(sla2/(180/Math.PI))*Math.cos(slo2/(180/Math.PI)-slo1/(180/Math.PI)));
        double distance = 6371*Math.atan((Math.sqrt((1-Math.pow(x,2))))/x);
        System.out.println("Enter Data for the Starting City:");
        System.out.println("    Name: "+start);
        System.out.println("    Latitude Degrees: "+slad);
        System.out.println("    Latitude Minutes: "+slam);
        System.out.println("    Latitude Seconds: "+slas);
        System.out.println("    Longitude Degrees: "+slod);
        System.out.println("    Longitude Minutes: "+slom);
        System.out.println("    Longitude Seconds: "+slos);
        System.out.println("***********************************************************");
        System.out.println("Enter Data for the Destination City:");
        System.out.println("    Name: "+dest);
        System.out.println("    Latitude Degrees: "+dlad);
        System.out.println("    Latitude Minutes: "+dlam);
        System.out.println("    Latitude Seconds: "+dlas);
        System.out.println("    Longitude Degrees: "+dlod);
        System.out.println("    Longitude Minutes: "+dlom);
        System.out.println("    Longitude Seconds: "+dlos);
        System.out.println("                                       ");
        System.out.println(start+" is "+distance+" kilometers away from "+dest);





    }
    }
