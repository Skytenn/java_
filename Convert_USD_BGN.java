package Lesson1.Homework;

import java.util.Scanner;

public class Convert_USD_BGN {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Entry USD: ");
        double usd=Double.parseDouble(scan.nextLine());

        double bgn=usd*1.79549;
        System.out.println(bgn);
    }
}
