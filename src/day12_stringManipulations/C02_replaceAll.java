package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n ja*va- cok g3uz/el";

        /*stri Bugun hava cok guzel haline getirin
        replaceAll() deki allun amacı aynı özellikteki tum karakterleri kapsamasıdır
        butun sayıları sil
        butun özel karakterleri sil
         */
        /*tum ozel karakterleri silelim dediğimizde spaceler de silinior
        spaceleri korumak için en basta onların yerine cumlede bulunmayan bir string koyalim

         */
        str=str.replace(" ","qazwsx");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str); //1Bu2gu3njavacokg3uzel

        str=str.replaceAll("\\d","");

        //simdi spaceleri geri getirelim

       str=str.replace("qazwsx"," ");
        System.out.println(str);

    }
}
