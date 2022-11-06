package lab9;
import java.util.Scanner;
public class bod4 {
    public static void main(String[] args) {
        String str, st="";
        Scanner scan = new Scanner(System.in);
        System.out.print("Temdegt muriig oruul ");
        str=scan.nextLine();
        scan.close();
        int a=str.length();
        if(a%2==0)
        {for(int k=0;k<(a/2);k++)
            st=st+str.charAt(k);
            System.out.print("\n st = "+st);}
        else
            System.out.print("\n huvaah bolomjgui");
    }}