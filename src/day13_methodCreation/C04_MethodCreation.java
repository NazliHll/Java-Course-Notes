package day13_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
         /*
        Input olarak verilen 2 integer'i toplayip sonucunu yazdiran
        bir method olusturun.
         */

        int input1 = 10;
        int input2 = 20;

        /*
        Method 4 adimda olusturulur.

        1. adim : method call
        2. adim : argument eklenmesi gerekiyorsa ekleyelim
        Method'un return type void'den farkli olacaksa bir variable olusturup
        method call'u assign edelim.
        3. adim : Method deklaroasyonunda degisitirilmesi gereken bolumleri degistir
        (access modifier, return Type vb...)
        4. adim : return type void dişinda bir seyse return keyword'u ve donecek degeri
        hesaplamaliyiz.

         */
        
        topla(input1,input2);
        
    }
    public static void topla(int input1, int input2) {
        System.out.println("girilen sayilarin toplami: "+(input1+input2));
    }

}
