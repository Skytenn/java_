package Lesson1.Homework;

import java.util.Scanner;

public class Vac_book_list {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        int page=Integer.parseInt(scann.nextLine());
        int hour=Integer.parseInt(scann.nextLine());
        int days=Integer.parseInt(scann.nextLine());

        int total_h=page/hour;
        int per_day=total_h/days;
        System.out.println("Per day "+per_day+" Hour");

    }
}
