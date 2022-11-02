package lab8;
//1-ээс N хүртэлх тоонуудаас анхны тоонуудыг нь олж гарга.
public class bod7 {
    public static void main(String[] args) {
        int n=100;
        int i =0;
        int num =0;

        for (i = 1; i <=n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter++;
                }
            }
            if (counter ==2)
            {
                System.out.println(i);
            }
        }
    }
}
