package day11_stringManipulations;

public class C07_startsWith {
    public static void main(String[] args) {
        String input="java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("j"));//true
        System.out.println(input.startsWith("")); //true
        System.out.println(input.startsWith("gun",5));//true



    }
}
 