package day32_StringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3);
        System.out.println(sb);//Kayra
         /*
        Bu method String dondurdugu icin StringBuilder'in eksi halini degistirmez.
         */

        sb.subSequence(0,3);
        System.out.println(sb);//Kayra
    }
}
