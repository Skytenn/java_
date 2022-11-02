package Lesson1;
import java.util.Scanner;
public class Hashaanii_tulbur_oloh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hashaanii hemjee oruulna uu  mkB: ");
        int  size= Integer.parseInt(scanner.nextLine());
        float a= (float) 7.61;
        double total=size*a;
        double dis=0.18*total;
        double sub=total-dis;
        System.out.println("Tanii tuluh tulbur : $"+sub+" bolno.");
    }
}
