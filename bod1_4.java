package lab8;

import java.util.Scanner;

public class bod1_4 {
    public static void main(String[] args) {
        long binary1,binary2,multiply=0;
        int digit, factor=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Input the firsht binary number:");
        binary1=in.nextLong();
        System.out.println("Input the second binary number:");
        binary2=in.nextLong();
        while(binary2!=0){
            digit= (int) (binary2%10);
            if (digit==1 ){
                binary1=binary1*factor;
                multiply=binaryproduct((int)binary1,(int)multiply);
                binary2=binary2/10;
                factor=10;

            }
            else
                binary1=binary1*factor;
                binary2=binary2/10;
                factor=10;

        }
        System.out.print("Product of two binary numbers: "+multiply+"\n");
    }

    private static int binaryproduct(int binary1, int multiply) {
        return binary1;
    }
}
