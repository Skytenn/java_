package lab9;

import java.util.Scanner;

public class bod17 {
    static boolean Power(int n)
    {
        return ((n>0) && ((n & n-1) == 0) && (n%3 == 1));
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Too oruulna uu: ");
        int n= sc.nextInt();
        sc.close();
        if(Power(n) == true)
            System.out.println(n +" >>"+ " 4iin zeregt bolj chadna");
        else
            System.out.println(n +" >>"+ " 4iin zeregt bolj chadahgui");
    }
}

