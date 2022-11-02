package Lesson2;

import java.util.Scanner;

public class Max_num {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Too oruulna uu: ");
        int num1=Integer.parseInt(scan.nextLine());
        int num2=Integer.parseInt(scan.nextLine());

        if (num1>num2)
            System.out.println("Max num: "+num1);
        else
            System.out.println("Max num: "+num2);
        
    }
}
