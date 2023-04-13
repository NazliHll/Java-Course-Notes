package day42_AbstractClass_Interfaces;

public class K_ChildClass implements I02_Interfaces,I03_Interfaces{
     /*
    bir class'i bir ınterface'e child yapmak icin implements keyword kullanilir.
    implements dedikten sonra virgul yazarak istedigimiz kadar ınterface ekleyebiliriz.
    Bir interface bir class'i parent edinemez
     */
     public static void main(String[] args) {
         System.out.println(I03_Interfaces.SAYI);
         System.out.println(I02_Interfaces.SAYI);
         System.out.println(ISIM);
     }
}
