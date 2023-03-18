package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi girin");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lutfen yasinizi girin");
        double yas=scan.nextDouble();
        System.out.println("girilen bilgiler="+isim+" "+soyisim+" "+yas);



    }
}
