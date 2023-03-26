package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
         /*
        Kullanicidan toplanmak uzere sayilar alın
        sayılarin toplami 500'ü gecince (500 dahil)
        sayilarin toplamını ve kaç sayı toplandığını
        şu şekilde yazdirin
        13 sayi girdiniz ve toplamlari 567
         */
        int top=0;
        int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);


        while (top<500){

            System.out.println("lutfen toplamak icin sayi girin");
            sayi=scan.nextInt();
            top+=sayi;
            sayac++;
        }
        System.out.println(sayac+"sayi girdiniz "+ top);
    }
}
