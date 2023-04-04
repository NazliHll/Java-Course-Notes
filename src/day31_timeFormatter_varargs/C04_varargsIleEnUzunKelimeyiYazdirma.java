package day31_timeFormatter_varargs;

public class C04_varargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","Ismail");
    }

    public static void enUzunKelimeyiYazdir(String...kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime
             ) {
           if(each.length()>enUzunKelime.length()){
               enUzunKelime=each;
           }
        }
        System.out.println("en uzun kelime: "+enUzunKelime);
    }
}
