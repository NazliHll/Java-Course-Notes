package day13_methodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
         /*
         Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sifre girin");
        String sifre=scan.nextLine();
        int kontrol=0;
        //ilk harf kontrolu
        if(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') {
            kontrol++;
        }else {
            System.out.println("ilk harf buyuk olmali");

        }
        //son harf kontrolu
        if(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') {
            kontrol++;
        }else {
            System.out.println("son harf kucuk olmali");
        }
        //sifre bosluk kontrolu
        if(sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
        }else {
            kontrol++;
        }
        //sifre uzunluk kontrolu
        if(sifre.length()>=8) {
            kontrol++;
        }else {
            System.out.println("sifre en az 8 karakter olmali");
        }
        if(kontrol==4) {
            System.out.println("sifre basari ile tamamlandi");
        }else {
            System.out.println("islem basarisiz,yeni bir sifre girin");

        }


    }
}
