package lab9;

import java.util.Scanner;
public class bod5 {
    public static void main(String[] args) {
        String str1, str2, st="";
        Scanner scan = new Scanner(System.in);
        System.out.print("Ehnii temdegt muriig oruul ");
        str1=scan.nextLine();
        System.out.print("2 dahi temdegt muriig oruul ");
        str2=scan.nextLine();
        scan.close();
        int a=str1.length(), b=str2.length();
        for(int k=1;k<a;k++) {
            st=st+str1.charAt(k);}
        for(int k=1;k<b;k++) {
            st=st+str2.charAt(k);}
        System.out.print("\n Niiluulsen temdegt mur = "+st);}
}