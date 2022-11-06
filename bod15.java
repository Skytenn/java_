package lab9;

import java.util.Scanner;
//Өгсөн 2 хэмжээст массивын тэгш болгон сондгой тоо тус бүр
//хэдэн ширхэг байгааг олж гаргана уу.
public class bod15 {
    public static void main(String[] args) {
        int s=0,k=0,g=0,h=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ehnii massiviin elementiin hemjeeg oruulna uu: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Massiviin elementuudiig oruulna uu: ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("2dh Massiviin elementiin hemjeeg oruulna uu: ");
        int m=sc.nextInt();
        int num[]=new int[m];
        System.out.println("Massiviin elementuudiig oruulna uu: ");
        for(int i=0;i<m;i++)
        {
            num[i] = sc.nextInt();
        }
        sc.close();

        for (int j : nums)
        {
            if(j%2==0)
                s++;
            else
                k++;
        }
        for (int l : num)
        {
            if(l%2==0)
                g++;
            else
                h++;
        }

        System.out.println("Ehnii massivd tegsh too: "+s+"\n Sondgoi too: "+k+" shirheg baina.");
        System.out.println("2dh massivd tegsh too: "+g+"\n Sondgoi too: "+h+" shirheg baina.");


    }
}
