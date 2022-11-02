package lab8;
//100-150 тоонуудын цифрүүдийн нийлбэр нь тэгш байх тоонуудыг
//нь гарга.
public class bod6 {
    public static void main(String[] args) {
        int n=0, s = 0,i=100;
        while(i>0) {
            for (i=100; i < 150; i++) {
                n = i % 10;
                s = s + n;
                i = i / 10;
                if (s % 2 == 0) {
                    System.out.println(s);
                }

            }
        }
            //if(s%2==0){



            // }

        }
    }
