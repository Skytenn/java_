package Lesson1.Homework;

import java.util.Scanner;

public class Sup_school {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many pen:");
        int pen=Integer.parseInt(scan.nextLine());
        System.out.println("Marker:");
        int marker=Integer.parseInt(scan.nextLine());
        System.out.println("Detergent:");
        double det=Double.parseDouble(scan.nextLine());
        System.out.println("Discount:");
        int dis=Integer.parseInt(scan.nextLine());

        double p_total=pen*5.80;
        double m_total=marker*7.20;
        double d_total=det*1.20;


        double all_total=p_total+m_total+d_total;
        double price=all_total-(all_total*dis/100);

        System.out.println("All price: "+price);



    }
}
