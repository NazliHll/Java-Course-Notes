package day11_stringManipulations;

public class C05_endsWith {
    public static void main(String[] args) {
        String str="ah be java";
        System.out.println(str.endsWith("ava")); //true
        System.out.println(str.endsWith("be java")); //true
        System.out.println(str.endsWith("ah be java")); //true
        System.out.println(str.endsWith("")); //true


    }
}
