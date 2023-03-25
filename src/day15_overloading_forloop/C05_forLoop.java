package day15_overloading_forloop;

public class C05_forLoop {
    public static void main(String[] args) {
        //1den 5e(dahil) kadar olan tamsayilari toplayalim
        int toplam=0;


        for (int i = 1; i <=5 ; i++) {

         toplam+=i;

        }
        System.out.println("toplam = " + toplam);

        //10 dahil 20dahil aradaki sayilari toplayin
        toplam=0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;
            
        }
        System.out.println("toplam = " + toplam);

        //30 dahil 50 dahil aradaki çift sayılari toplayin
        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;

        }
        System.out.println("toplam = " + toplam);
        
        //2.yontem
        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }

        }
        System.out.println("toplam = " + toplam);

            //1500 ile 1600 arasinda 7ile bolunebilen sayilari toplayin
            toplam=0;

        for (int i = 1500; i <=1600 ; i++) {
            if(i%7==0) {
                toplam+=i;

        }

            }
        System.out.println("toplam = " + toplam);

            }
            
        }



