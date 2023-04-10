package day37_overridding;

public class EToyota extends DAraba{
void marka(){
    System.out.println("markamiz toyota");
}
    /*
         super.marka();
         eger hem overridden hem de overridding method'un calismasini istersek
         ilk satira super.marka() yazabiliriz.
         */
    void motor() {
        System.out.println("toyota araclar toyota marka motor kullanir");
    }
}
