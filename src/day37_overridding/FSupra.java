package day37_overridding;

public class FSupra extends EToyota{
    @Override
    void yakit(){
        System.out.println("supra benzin kullanir");
    }

    @Override
    void motor() {
       /*
        --> @Override rotasyonu Javaya bir gorev verir.
        Java, bu rotasyonla birbirine bagli olan iki moethod'u surekli kontrol eder.
        Eger parent class'daki override method'u silerseniz CTE verir
        --> @Override rotasyonu kullanmak mecburi değildir.
               Eger Overridding method silinirse, kodun CTE vermesini istersek
        @Override rotasyonu kullanmaliyiz.
         */

    }
}
