package day31_timeFormatter_varargs;

public class C02_varargs {
    public static void main(String[] args) {
        //Verilen 2 int'i toplayip sonucu yazdiran bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4);

    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("dort sayinin toplami: "+(sayi1+sayi2+sayi3+sayi4));
    }

    public static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("iki sayinin toplami: " + (sayi1 + sayi2));
    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("uc sayinin toplami: "+(sayi1+sayi2+sayi3));
    }
}
