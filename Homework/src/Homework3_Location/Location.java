package Homework3_Location;

import java.util.Scanner;

public class Location {
    public int i, j;

    public Location(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public static Location locateLargest(double[][] arr) {
        double max = arr[0][0];
        int k=0;
        int l=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    k = i;
                    l = j;
                }
            }
        }
        Location largest = new Location(k, l);
        return largest;
    }
    public static double max (double[][] arr){
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int r = in.nextInt();
        int c = in.nextInt();
        System.out.println("Enter the array: ");
        double[][] arr = new double[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        double max = max(arr);
        Location largest = locateLargest(arr);
        int k = largest.getI();
        int l = largest.getJ();
        System.out.println("The location of the largest element "+max+" is at ("+k+", "+l+")");

    }
}
