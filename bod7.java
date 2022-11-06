package lab9;

import java.util.Scanner;

public class bod7 {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Massiviin elementiin hemjeeg oruulna uu: ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Massiviin elementuudiig oruulna uu: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Masiiviin ehnii utga: "+a[0]);
        System.out.println("massiviin suuliin utga: "+a[a.length-1]);
    }
}
