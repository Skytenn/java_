package lab9;

import java.util.Arrays;
import java.util.Scanner;

//Өгсөн массивын элементүүдийг өсөхөөр эрэмбэлэн байрлуул.
public class bod16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("massiviin elementiin hemjeeg oruulna uu: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Massiviin elementuudiig oruulna uu: ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int temp=0;
        for ( int k=0;k<nums.length;k++)
        {
            for (int j =k+1; j <nums.length; j++) {
                if(nums[k] >nums[j]) {
                    temp =nums[k];
                    nums[k] =nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
