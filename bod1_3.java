package lab8;

import java.util.Scanner;

public class bod1_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int octal= sc.nextInt();
        sc.close();
        int decimal =Octal(octal);
        System.out.printf(" 8tiin too ni: %d = 10tiin too ni: %d", octal, decimal);
    }

    public static int Octal(int octal)
    {
        int decimalNumber = 0, i = 0;

        while(octal != 0)
        {
            decimalNumber += (octal % 10) * Math.pow(8, i);
            ++i;
            octal/=10;
        }

        return decimalNumber;
    }
}