package lab8;

import java.util.Random;
//Санамсаргүй тоо сонгож аваад тэгш, сондгойг нь тодорхойлж
//гарга.
public class bod12 {
    public static void main(String[] args) {
        Random a=new Random();
        int r=a.nextInt(1000);
        if(r % 2== 0){
            System.out.println("Too tegsh: "+r);

    }
        else
            System.out.println("Too sondgoi: "+r);
    }
}
