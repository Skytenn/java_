package Lesson1.Homework;

import java.util.Scanner;

public class Deposit_Cal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Deposit amout:");
        Double Dep = Double.parseDouble(scan.nextLine());
        double mon= Double.parseDouble(scan.nextLine());
        double point=Double.parseDouble(scan.nextLine());
        double amo=Dep+mon*((Dep*point/100)/12);
        System.out.println(amo);

    }
}
