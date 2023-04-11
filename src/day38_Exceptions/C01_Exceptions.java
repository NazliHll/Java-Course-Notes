package day38_Exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        Bir sorunla karsilasmayi bekledigimiz noktalarda if-else ile sorunu yakalayip
        onunla ilgili cözüm uretebiliriz.
        Ama sorunu her zaman if-else ile cözemeyecegimizden Java try-catch block'lari
        olusturmustur.
         */
    int a=1000;
    int b=50;
    int sayac=1;
    while(sayac<100){

        if (b==0){
            System.out.println(" islem yapilirken payda 0 oldu,dikkat edin");
        }else{
            System.out.println(a/b);
        }


        b--;
        sayac++;
    }

    }
}
