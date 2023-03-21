package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); //5
        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("t")); //bana integer donduruyor
        // int'de yok diye bir deger bulunmuyor
        // 0 dersek J'nin index'idi.
        // (-) bir deger donenrse biz aranan string str'da olmadıgını anlariz.
        // Java -1 dondurmeyi tercih etmiştir.

        String str5 = "asdfghjklömnbvfdfgtyhujkılşçömnbvcdrftgyhjkömbvcdfgh";

        // str5'te P harfi var midir?

        if (str5.indexOf("s")==-1){
            System.out.println("str5de istenen karakter kullanilmamis");

        }else {

        }
        System.out.println("str5de istenen karakter kullanilmis");

    }
}
