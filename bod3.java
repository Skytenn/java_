package lab9;
import java.util.Scanner;
public class bod3 {


        public static void main(String[] args) {
            String str, st="";
            Scanner scan = new Scanner(System.in);
            System.out.print("Temdegt mur oruulna uu: ");
            str=scan.nextLine();
            scan.close();
            int a=str.length();
            st=st+str.charAt(a-3);
            st=st+str.charAt(a-2)+str.charAt(a-1);
            st=st+st+st+st;
            System.out.print("\n Suuliin 3-n temdegtees burdsen ug = "+st);
        }}
}
