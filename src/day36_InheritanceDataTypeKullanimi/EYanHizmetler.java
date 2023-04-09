package day36_InheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe {
    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("yan hizmetliler: "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("yan hizmetliler %30 indirimli issizlik sigortasi yaptırabilir");

    }

    public static void main(String[] args) {

    }

}
