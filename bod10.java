package lab9;

import java.util.Scanner;

public class bod10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Uguulber oruulna uu: ");
        String a= sc.nextLine();
        System.out.println("Haih ugee oruulna uu: ");
        String b= sc.nextLine();
        sc.close();

        String found;
        found= String.valueOf(a.contains(b));
        System.out.println(found);




    }
}
