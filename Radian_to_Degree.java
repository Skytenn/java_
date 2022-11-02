package Lesson1.Homework;

import java.util.Scanner;

public class Radian_to_Degree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double radian=Double.parseDouble(scan.nextLine());
        double degrees= radian*180/Math.PI;
        System.out.println(degrees);
    }
}
