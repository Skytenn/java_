package Lesson1.Homework;

import java.util.Scanner;

public class Fish_tank {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Length in cm: ");
        int L=Integer.parseInt(scan.nextLine());
        System.out.println("Width in cm:");
        int W=Integer.parseInt(scan.nextLine());
        System.out.println("Height in cm:");
        int H=Integer.parseInt(scan.nextLine());
        System.out.println("Percentagein: ");
        float P=Float.parseFloat(scan.nextLine());

        int V_a=L*W*H;
        double V_L=(V_a*0.001);
        float R= (float) (V_L*(1-(P/100)));
        System.out.println(R);



    }
}
