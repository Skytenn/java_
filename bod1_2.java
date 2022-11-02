package lab8;

import java.util.Scanner;

class bod1_2 {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("2tiin too oruulna uu: ");
        int num=sc.nextInt();
        sc.close();

        int decimal = Binary(num);

        System.out.println("Hurwuulew: ");
        System.out.println(num + " = " + decimal);
    }

    public static int Binary(int num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }

        return decimalNumber;
    }
}