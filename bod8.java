package lab9;
import java.util.Arrays;
import java.util.Scanner;

public class bod8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Massiviin elementiin hemjeeg oruulna uu: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Massiviin elementuudiig oruulna uu: ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }


        System.out.println("Umnuh massiv: "+Arrays.toString(nums));
        int x = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = x;
        System.out.println("Shine massiv: "+Arrays.toString(nums));
    }
}
