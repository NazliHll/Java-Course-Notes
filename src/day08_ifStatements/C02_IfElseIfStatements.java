package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 üzerinden notunu isteyin.
        Not'u harf sistemine çevirip yazdırın.
        50'den kucukse "D",
        50-60 arasi"C",
        60-80 arası"B",
        80'nin uzerinde ise "A"
        Gecersiz not girildiginde uyarı verelim
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 0'dan 100'e kadar bir not değeri girin");
        double note =scan.nextDouble();

        if (note<0 || note>100) {
            System.out.println("lutfen gecerli bi not girin");
        }else if (note<50) {
            System.out.println("notunuz:D");
        }else if (note<60) {
            System.out.println("notunuz :C");
        }else if (note<80) {
            System.out.println("notunuz : B");
        }else {
            System.out.println("notunuz: A");
        }



    }
}
