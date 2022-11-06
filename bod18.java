package lab9;

import java.util.Scanner;

public class bod18 {
    public static void main(String[] args) {
        int x,y,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ehnii toog oruulna uu: ");
        x=sc.nextInt();
        System.out.println("2 dh toog oruulna uu: ");
        y= sc.nextInt();
        sc.close();

        s=Integer.sum(x,y);

        System.out.println(s);


    }
}
