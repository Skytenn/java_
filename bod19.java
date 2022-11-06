package lab9;
import java.util.Arrays;

public class bod19 {
    public static void count(int arr[], int n)
    {
        boolean vis[] = new boolean[n];
        Arrays.fill(vis, false);
        for (int i = 0; i < n; i++) {
            if (vis[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    vis[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " = " + count);
        }
    }
    public static void main(String []args)
    {
        int arr[] = new int[]{ 10, 25, 20, 66, 10, 20, 5, 20 };
        int n = arr.length;
        count(arr, n);
    }
}
