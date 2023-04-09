package day36_InheritanceDataTypeKullanimi;

public class APersonel {
    String isim="isim beliritlmedi";
    String soyisim="soyisim belirtilmedi";
    String departman="departman belirtilmedi";

    protected void maas(){
        System.out.println("tum personel maas alir");
    }
    protected void sigorta() {
        System.out.println("tum personele sigorta yapilir");
    }

}
