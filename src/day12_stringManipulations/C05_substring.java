package day12_stringManipulations;

public class C05_substring {
    public static void main(String[] args) {
         /*
        kullanicidan 4 harfli bir kelime isteyin ve giriilen kelimeyi tersten yazdirin
         */
        String input="veli";
        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersInput);


    }
}
