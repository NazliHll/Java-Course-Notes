package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi girin");
        int yas=scan.nextInt();

        if (yas<65) {
            System.out.println("emekli olamazsin "+(65-yas)+" yil daha calismalisin");

        } else {
            System.out.println("emekli olabilirsin");
        }

    }
}
