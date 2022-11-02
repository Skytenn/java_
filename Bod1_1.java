package lab8;

import java.util.Scanner;
public class Bod1_1 {
    public static void main(String args[])
    {        int dec_num, quot, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.print("Arawtiin too oruulna uu : ");
        dec_num = scan.nextInt();
        quot = dec_num;
        while(quot != 0)
        {            bin_num[i++] = quot%8;            quot = quot/8;        }
        System.out.print("8 tiin too ni: ");
        for(j=i-1; j>0; j--)
        {            System.out.print(bin_num[j]);        }
        System.out.print("\n");    }}