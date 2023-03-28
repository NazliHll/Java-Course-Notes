package day20_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {
        int sayilar[]={1,2,3,4,5,6,7};
        //arrayin tamamini yazdiralim
        System.out.println(Arrays.toString(sayilar));//[1, 2, 3, 4, 5, 6, 7]

        //arrayin tum elementlerini yazdirin
        for (int i = 0; i <sayilar.length; i++) {
            System.out.print(sayilar[i]+" ");//1 2 3 4 5 6 7
        }


    }
}
