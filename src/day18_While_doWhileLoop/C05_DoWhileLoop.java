package day18_While_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        //Soru 1) 9 'dan 190 'a kadar 7'nin kati olan tam sayilari ekrana yazdirin.
        int bas = 9;
        int bit = 190;

        int temp = bas;

        //while loopla
        while (temp < bit) {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }
        //do while loopla
        System.out.println("");
        temp=bas;
        do{
            if(temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }while (temp<bit);
    }

}
