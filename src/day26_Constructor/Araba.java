package day26_Constructor;

public class Araba {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {

        marka = markaR;
        model = modelR;
        yil = yilR;
        fiyat = fiyatR;
    }
    public Araba(){

    }
    /*
    Biz herhangi bir constructor olusturdugumuzda
    Java default constructor siler.
    Eger biz projemizde bir sorun yaşanmasini istemiyorsak
    mutlaka default constructor yerine
    parametresiz bir constructor olusturmaliyiz.
    */

    public void benzinliArac() {
        System.out.println("bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("bu araba max "+hiz+" km hiz yapar" );
    }
}




