package lab9;


import java.util.Scanner;

//Бичсэн програмуудынхаа аль нэгийг сонгон хэдэн нано секундэд
//гүйцэтгэгдэж байгааг нь олж гаргана уу.
public class bod14 {
        static void num(int n, String[] arr) {
            if (n == 0) {
                return;
            }
            int d= n % 10;
            n=n/10;
            num(n, arr);
            System.out.print(arr[d]);
            System.out.print(",");
        }
        public static void main(String args[]) {
            String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            Scanner sc = new Scanner(System.in);
            System.out.println("Too oruulna uu: ");
            int n = sc.nextInt();
            sc.close();
            int sum = 0, f = 0;
            while (n != 0) {
                sum = sum + n % 10;
                f = n % 10;
                n = n / 10;
            }
            System.out.println("Tsipruudiin niilber:" + sum);
            num(sum, arr);
        //heden nano sekunded bodoj baigaag gargah heseg
            long start= System.nanoTime();
            long end=System.nanoTime();
            long e= end-start;
            System.out.println("\n Bodson hugatsaa: "+e+ " nanoseconds");

        }
    }