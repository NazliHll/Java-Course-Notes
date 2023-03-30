package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[]arr={"Ismail","Nurullah","Fatih"};
        /*
        Uzun listeler olusturmamiz gerektiginde, tek tek eklemek yerine array olusturup
        bunlari list'e cevirmek daha pratik olabilir.
            1- loop ile array'deki tum elementleri list'e atabiliriz.
            2- Array.asList() kullanabiliriz.
                --> ancak bu method'un 2 tane kotu yan etkisi vardir.
                    **> Array class'i kullanildigi icin array ozellikleri gecerli olur
                    dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
                    bu sekilde olusturulan list'lerde kullanilmaz.
                    **> Kaynak olan array ile urun olan list ozdezlestirilir. birinde
                    yapilan degisiklik, otomatik olarak digerien de islenir.
         */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println("sinifList = " + sinifList);//[Ismail, Nurullah, Fatih]
        /*
         1. yan etki :
          sinifList.add("Erdi"); --> UnsupportedOperationException
          sinifList.remove(1); --> UnsupportedOperationException
         */

        /*
        2. yan etki :
         */
        arr[1]="Emre";
        System.out.println("degisim sonrasi array: "+Arrays.toString(arr));//[Ismail, Emre, Fatih]
        System.out.println("arrayi degistirince list:"+sinifList);//[Ismail, Emre, Fatih]

        sinifList.set(0,"Utku");
        System.out.println("listi degitrince list: "+sinifList);//[Utku, Emre, Fatih]
        System.out.println("listi degistirince array: "+Arrays.toString(arr));//[Utku, Emre, Fatih]


    }
}
