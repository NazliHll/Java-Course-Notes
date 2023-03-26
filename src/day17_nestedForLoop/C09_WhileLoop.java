package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
 /*
         Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin.
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan=new Scanner(System.in);
        String sifre="";
        boolean sifreBasariliMi=false;
        int kontrol=0;


        while(!sifreBasariliMi){
        System.out.println("lutfen bir sifre girin");
        sifre=scan.nextLine();
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
                sifreBasariliMi=true;
            }else {
               kontrol=0;

            }































        }


    }
}
