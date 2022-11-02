package Lesson1.Homework;

import java.util.Scanner;

public class Food_D {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Number of chicken:");
        int chic=Integer.parseInt(scan.nextLine());
        System.out.println("Number of fish: ");
        int fish=Integer.parseInt(scan.nextLine());
        System.out.println("Number of  vegetarian:");
        int Vege=Integer.parseInt(scan.nextLine());

        float P_chick= (float) (chic*10.35);
        float P_fish= (float) (fish*12.40);
        float P_vege= (float) (Vege*8.15);

        float total_p=P_chick+P_fish+P_vege;
        float dess= (float) (total_p+2.50+total_p*0.20);
        System.out.println("Total price of the order: "+dess);


    }
}
