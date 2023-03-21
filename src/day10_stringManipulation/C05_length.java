package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {
        String str="java ogren, isi kap";
        System.out.println(str.length());//strnin karakter sayisini verir
        System.out.println(str.charAt(str.length()-1));//son karakterini verir
        System.out.println(str.charAt(str.length()-3)); //sondan 3.karakteri verir

        /*
        java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazildigi veriable'in hicbir deger almadiginin isaretcisidir.
        */

        String str2 = ""; // str2'ye bir deger atamis midir ? EVET
        // bu deger nedir : HİCLİK

        System.out.println(str2.length()); // 0


        String str3 = null; // str3'e bir deger atanmiş midir? HAYIR
        // null bu deger atamamayi isaret etmektedir.

        System.out.println(str3.length()); // bir deger atanmamiş ki nasil uzunlugu olsun ?
        // NullPointerException olarak hata verir.



    }
}
