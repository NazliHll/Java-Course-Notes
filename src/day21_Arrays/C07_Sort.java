package day21_Arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {
         /*
        Array'i Arrays class'ini kullanarak natural
         (Sayilarda kücükten büyüğe, Stringlerde harf sıralamasına)
          sirali hale getirebiliriz.
         */
        int[] sayilar={5,7,5,9,1,6,4,3,9};

        //Array'i arrays classini kullanarak natural sirali hale getirebiliriz

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));
    }
}
