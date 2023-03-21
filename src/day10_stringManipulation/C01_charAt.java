package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {
        String str="java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); //ilk harfi yazdırır J
        System.out.println(str.toUpperCase().charAt(7)); //R
        System.out.println(str.charAt(21));//l

         /*
        System.out.println(str.charAt(22)); // StringIndexOutOfBoundsException
        Son harfi bulmak icin str'in uzunlugunun 1 eksigini idex olarak gireriz.
        eger index olarak uzunlugu veya daha bir sayiyi girersek Java exception verir
         */

        /*
        charAt() kullandigimmizda sonuc char olacagi icin artik manipulation yapmayiz
        Stirng method'larindan kullanmamiz gereken bir method varsa charAt () önce kullanmaliyiz.
         */
    }
}
