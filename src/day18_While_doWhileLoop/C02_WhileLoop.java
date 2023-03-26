package day18_While_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
       Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
         */

        int input = 5432;

        int rakamlarTop=0;
        int birBas=0;
        int temp=input;

        while (temp>0){
            birBas=temp%10;
            rakamlarTop+=birBas;
            temp/=10;
        }
        System.out.println(input+" sayisinin rakamlar toplami: "+rakamlarTop);

    }
}
