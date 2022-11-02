package lab8;
//Өгсөн  тоог  5  болон  7-ын  2-уулангынх  нь  үржвэр  мөн  эсэхийг
//тодорхойл.
import java.util.Scanner;

public class bod3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("too oruulna uu: ");
        int n = sc.nextInt();
        sc.close();
        if (n%5==0 && n%7==0){
            System.out.println("Urjwer mun");
        }
        else
            System.out.println("Urjwer bish");

    }
}
