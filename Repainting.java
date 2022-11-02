package Lesson1.Homework;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Entry Nylon mkB: ");
        int nylon=Integer.parseInt(scan.nextLine());
        System.out.println("Entry paint liter:");
        int paint=Integer.parseInt(scan.nextLine());
        System.out.println("Entry detergent liter: ");
        int det=Integer.parseInt(scan.nextLine());
        System.out.println("Entry working hours: ");
        int hour=Integer.parseInt(scan.nextLine());


        double s_ny=(nylon+2)*1.50;
        double s_p=(paint*14.50+(paint*14.50*0.10));
        double s_d=det*5.00;
        double bags=0.40;
        double t_sum=s_ny+s_p+s_d+bags;
        double s_w=(t_sum*0.30)*hour;
        double t_p=t_sum+s_w;

        System.out.println("Total price: "+t_p);
    }
}
