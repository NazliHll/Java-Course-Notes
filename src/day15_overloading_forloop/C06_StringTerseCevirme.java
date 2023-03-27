package day15_overloading_forloop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        //input olarak verilen string'i terse cevirip yazdiran bir method olusturun.

        String input="java gun gectikce guzellesiyor";

        terstenYazdirma(input);

    }

    public static void terstenYazdirma(String input) {
        String tersInput=input.substring(input.length()-1);

        for (int i = input.length()-2; i>=0 ; i--) {
            tersInput+=input.substring(i,i+1);
            

        }
        System.out.println("tersInput = " + tersInput);




    }
}