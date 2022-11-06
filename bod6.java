package lab9;

import java.util.Scanner;
public class bod6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[];
        a=new int[10];
        int max, min, s=0;
        for(int i=0;i<10;i++)
        {System.out.print((i+1)+"-r utga=");
            a[i]=scan.nextInt();
            s=s+a[i]; }
        scan.close();
        max=min=a[0];
        for(int k=1; k<10;k++)
        {if(max<a[k])
            max=a[k];
        else if(min>a[k])
            min=a[k];}
        System.out.print("\nNiilber= "+s);
        System.out.print("\nMax= "+max);
        System.out.print("\nMin= "+min);
    }
}