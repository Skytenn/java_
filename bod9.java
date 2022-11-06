package lab9;
import java.util.Arrays;
import java.util.Scanner;

public class bod9 {
    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5};
        int nums[] = {6, 7, 8, 9, 10};
        int counter = 0;
        for (int i = 0; i < num.length; i++)
            if (num[i] != 0) {
                counter++;
            }
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                count++;

        if (counter == count)
        {
            int sum[]=new int[num.length];
            for (int i = 0; i < num.length; i++)
            {
                sum[i] = num[i] * nums[i];
            }
            System.out.println("Huuchin massiv1: "+Arrays.toString(num));
            System.out.println("Huuchin massiv2: "+Arrays.toString(nums));
            System.out.println("Shine massiv: "+Arrays.toString(sum));
        }
        else
            System.out.println("Massiviin urt zuruutei bn.");
    }
}
