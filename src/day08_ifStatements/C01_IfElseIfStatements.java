package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
     Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir gun ismi girin");
        String gun=scan.nextLine().toLowerCase();

        if(gun.equals("pazartesi")) {
            System.out.println("paz");
        }else if (gun.equals("sali")) {
            System.out.println("sal");
        }else if (gun.equals ("carsamba")) {
            System.out.println("car");
        }else if (gun.equals ("parsembe")) {
            System.out.println("per");
        }else if (gun.equals("cuma")) {
            System.out.println("cum");
        }else if (gun.equals("cumartesi")) {
            System.out.println("cum");
        } else if(gun.equals("pazar")) {
            System.out.println("paz");
        }else {
            System.out.println("lutfen gecerli bi gun ismi girin");

        }

    }
}
