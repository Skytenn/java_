package lab7;

import java.util.Scanner;
import java.lang.Math;

public class bodlogo3 {

        static class Triangle{
            public static void main(String[] args) {
            Scanner scann=new Scanner(System.in);
            float a=scann.nextFloat();
            float b=scann.nextFloat();
            float c=scann.nextFloat();
            scann.close();
            float p=(a+b+c);
            float s= (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
             System.out.println("Premetr="+p+"\nTalbai="+s);
        }

    }

}
