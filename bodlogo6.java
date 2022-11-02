package lab7;

import java.util.Scanner;

public class bodlogo6 {
    public static class Complex{
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println("Too oruulna uu:");
            float a=scan.nextFloat();
            float b=scan.nextFloat();
            scan.close();

            float niilber=a+b;
            float ylgawar=a-b;
            float urjwer=a*b;

            System.out.println("Niilber: "+niilber+"\n Yalgawr: "+ylgawar+"\n urjwer: "+urjwer);
        }

    }
}
