package day15_overloading_forloop;

public class C08_Faktoryel {
    public static void main(String[] args) {
         /*
        input olarak verilen bir tam sayi icin faktöriyel hesaplayip yazdiran
        bir method olusturun.
        verilen sayi negatif veya 20 den buyuk olursa
        "girilen sayinin faktöriyeli hesaplanamaz" uyarisi yazdirin
         */
        int input=5;
        faktoryelHesapla(input);
    }

    public static void faktoryelHesapla(int input) {
        int faktoryel=1;
        if(input<0 || input>20) {
            System.out.println("verilen sayi icin faktoryel hesaplanmaz");
        } else if (input==0) {
            System.out.println("0!=1");
        }else {
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;
                
            }
            System.out.println("faktoryel degeri: "+faktoryel);
        }
    }
}
