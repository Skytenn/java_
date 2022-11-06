package lab9;

import java.util.Scanner;

public class bod20 {

    static String Max(String str)
    {
        int n = str.length();
        int i = 0;
        int c= 0;
        int max = 0;
        int st = -1;
        while (i < n)
        {
            if (str.charAt(i) == ' ')
            {
                if (c%2== 0)
                {
                    if (max<c)
                    {
                        max = c;
                        st=i-c;
                    }
                }
                c=0;
            }
            else
            {
                c++;
            }

            i++;
        }

        if (c%2== 0)
        {
            if (max<c)
            {
                max=c;
                st=i-c;
            }
        }

        if (st == -1)
            return "-1";

        return str.substring(st,st+max);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Uguulber oruulna uu: ");
        String str=sc.nextLine();
        sc.close();

        System.out.println( "Hamgiin urt ug : "+Max(str));
    }
}

