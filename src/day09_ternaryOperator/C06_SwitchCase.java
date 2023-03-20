package day09_ternaryOperator;


public class C06_SwitchCase {
    public static void main(String[] args) {
         /*
        Kullanicidan gun ismini alin
        hafta ici veya hafta sonu oldugunu yazdirin.
         */
        String input="pazar";
        switch(input) {
            case "pazartesi":
            case "sali":
            case "carsamba" :
            case "persembe" :
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("gecerli bir gun girin");

        }


    }
}
