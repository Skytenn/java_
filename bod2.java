package lab9;
import java.util.Scanner;
public class bod2 {

        public static void main(String[] args) {
            String str, str1, strc, st="";
            Scanner scan = new Scanner(System.in);
            System.out.print("Ehnii temdegt muriig oruul: ");
            str=scan.nextLine();
            System.out.print("2 dahi temdegt muriig oruul: ");
            str1=scan.nextLine();
            System.out.print("Dund ni nemeh temdegt muriig oruul: ");
            strc=scan.nextLine();
            scan.close();
            st=str+strc+str1;
            System.out.print("\nniiluulsen temdegt mur = "+st);
        }}
}
