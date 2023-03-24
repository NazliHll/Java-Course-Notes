package day14_methodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

   // verilen uc basamaklı bir sayinin rakamlarini toplamıni yazdiran bir method olsuturalim

        int input=578;
        rakamlariTopla(input);

    }

    public static void rakamlariTopla(int input) {
        int birBas=0;
        int rakamlarTop=0;
        int temp=input;

        birBas=input%10;
        rakamlarTop+=birBas;
        input/=10;

        birBas=input%10;
        rakamlarTop+=birBas;
        input/=10;

        birBas=input%10;
        rakamlarTop+=birBas;
        input/=10;

        System.out.println("girdiginiz " + temp+ " sayisinin rakamlar toplami :"+ rakamlarTop);

    }
}
