package lab7;

import java.util.Scanner;

public class bodlogo7 {
    public static class Employee{
        public static void main(String[] args) {

            for(int i=0;i<5;i++ ) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Your name: ");
                String name = scan.nextLine();
                Scanner yr = new Scanner(System.in);
                System.out.println("Year of joining: ");
                int year = yr.nextInt();
                Scanner ad = new Scanner(System.in);
                System.out.println("Adress: ");
                String add = ad.nextLine();


                System.out.println("Name    "+"Year of joining     "+"Address "+"\n"+name+"         "+year+"           "+add);
            }



        }
    }
}
