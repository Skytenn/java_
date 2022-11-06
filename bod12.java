package lab9;

import java.util.Scanner;

public class bod12 {
    public static void main(String[] args) {
        int s=0,n,t,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Too oruulna uu: ");
        n= sc.nextInt();
        sc.close();
        t=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n/=10;

        }
        if(t==s)
        {
            System.out.println("Palindrom too mun: "+t);
        }
        else
            System.out.println("Palindrome too bish.");
    }
}
