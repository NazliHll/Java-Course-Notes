package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {

    /*
  Soru 1) Kullanicidan email adresini girmesini isteyin,
 mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
 @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
 @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen email yazin");
        String email=scan.nextLine();

        if(!email.contains("@gmail")) {
            System.out.println("lutfen gmail adresi girin");
        }else if(email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yaziyi kontrol edin");

        }
    }
}
