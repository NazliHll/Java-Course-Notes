package day09_ternaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        double sayi=scan.nextDouble();

        System.out.println(sayi>0 ? "sayi pozitif" : (sayi*sayi));

    }
}
