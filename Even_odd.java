package Lesson2;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Entry number: ");
        int num=Integer.parseInt(scan.nextLine());


        if (num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
