package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi girin");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi girin");
        double yas=scan.nextDouble();
        if (cinsiyet=='E') {
            if(yas<0 || yas >80){
                System.out.println("gecerli yas girin");
            }else if (yas<65) {
                System.out.println("emekli olamazsin");
            }else {
                System.out.println("emekli olabilirsin");
            }

        }else if  (cinsiyet=='K') {
            if(yas<0 || yas >80){
                System.out.println("gecerli yas girin");
            }else if (yas<60) {
                System.out.println("emekli olamazsin");
            }else {
                System.out.println("emekli olabilirsin");
            }

        }else {
            System.out.println("lutfen gecerli bir tercih girin");

        }
    }
}
