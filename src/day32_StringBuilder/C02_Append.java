package day32_StringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java daha ne yapsin");
        sb.append("?");
        System.out.println(sb);//Java daha ne yapsin?

         /*
        Append istedigimiz String'i en sona ekler
         */
        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb);//Java her seyi dusunmus, daha ne yapsin?

        /*
        Araya ekleme yapmak istedimizde append degil insert kullanmaliyiz.
         */

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);//Java her seyi dusunmus valla, daha ne yapsin?


    }
}
