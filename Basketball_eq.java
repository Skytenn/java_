package Lesson1.Homework;

import java.util.Scanner;

public class Basketball_eq {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("The annual fee for basketball training: ");
        int T_price=Integer.parseInt(scan.nextLine());
        double Sn=T_price-(T_price*0.40);
        double outfit=Sn-(Sn*0.20);
        double basket=outfit/4;
        double Acc=basket/5;
        double Total=T_price+Sn+outfit+basket+Acc;

        System.out.println("Total :"+Total);

    }
}
