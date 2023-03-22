package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {
        String str="bu gun ha va cok guz el";
        System.out.println(str.replace(" ",""));

        //hava kelimesini java yapalim
        System.out.println(str.replace("h","J").replace(" ",""));

        //guze l yerine harika yazalim
        System.out.println(str.replace("guz el","harika"));

        //cumleyi replace kullanarak bugun java cok guzel yazalim
        str=str.replace("bu gun","bugun")
                .replace("ha va","java")
                .replace("guz el","guzel");
        System.out.println(str);



    }
}
