package lab9;

public class bod1 {
    public static void main(String[] args) {
        int s=0;
        int a=0,m,k=1,t=0;
        System.out.print("Ehnii 100-n anhni too\n");
        while(t<100)
        {
            a=0;
            for(m=2;m<k/2;m++)
            {if(k%m==0)
                a=1;    }
            if(a==0)
            {
                s=s+k;
                t++;
                System.out.print(k+"\t");
            }
            k++;
        }
        System.out.print("\n Ehnii 100-n anhni tooni niilber= "+s);
    }
}

