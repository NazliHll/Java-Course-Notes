package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" "+str2+" "+sayi1+sayi2); //Java Guzeldir 54
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));// Java Guzeldır 9
        System.out.println(sayi1 + sayi2 + " " + str1); //9 Java
        System.out.println("" + sayi1 + sayi2 + " " + str2); // 54 Guzeldir

        System.out.println(str1.concat(str2)); //JavaGuzeldir
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir

        System.out.println(5 * 2 != 15); // eşit değildir demi, eşit değil çıkarsa true cevabını verir.
        System.out.println(5 + 2 != 7); // Eşit değildir demi, eşit çıkarsa false cevabını verir

        System.out.println(!(3 * 5 > 7)); // Ünlem işareti işlemin tersini almaya yarar,






    }
}
