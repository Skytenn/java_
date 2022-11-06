package lab9;

import java.util.Scanner;

public class bod11 {
    public static void main(String[] args) {
        int a,b=0,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Too oruulna uu: ");
        a= sc.nextInt();
        sc.close();

       while(b<a)
       {
           if(a%2==0)
           {
               b=b+i;

           }
           i++;
       }
        if(b==a)
        {
           System.out.println("tugs too mun: "+a);
        }
        else
        {
            System.out.println("Tugs too bish.");
        }
    }
}
