package day49_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_MapMethodlari {
    public static void main(String[] args) {
        Map<String, Integer> harfler = new TreeMap<>();

        harfler.put("S", 40);
        harfler.put("H", 20);
        harfler.put("K", 50);
        harfler.put("M", 10);

        System.out.println(harfler); // {H=20, K=50, M=10, S=40}

        //mapteki tum harfleri yazdirin
        System.out.println(harfler.keySet()); //[H, K, M, S]

        //map deki sayilari yazdirin
        System.out.println(harfler.values()); //[20, 50, 10, 40]

        //map de harf olarak A var mı ?
        harfler.containsKey("A"); // false

        //map de harf olarak K var mı ?
        harfler.containsKey("K"); //true

        //map de sayi olarak 40 var mi?
        System.out.println(harfler.containsValue(40));//true

        //map de sayi olarak 0 var mi
        System.out.println(harfler.containsValue(0));//false

        //map de H'nin degerini yazdirin
        System.out.println(harfler.get("H")); //20

        //map de k'nin degerini yazdirin K yoksa 0 yazdirin
        System.out.println(harfler.get("T")); // null
        System.out.println(harfler.getOrDefault("K", 0)); // 50
        System.out.println(harfler.getOrDefault("T", 0)); // 0

        harfler.replace("K", 70); //varsa degerini update eder yoksa yeni kayit eklemez
        System.out.println(harfler); //{H=20, K=70, M=10, S=40}

        harfler.replace("Z", 30); //{H=20, K=70, M=10, S=40}
        System.out.println(harfler);

        harfler.put("H", 44);//varsa degerini update eder yoksa yeni kayit ekler
        System.out.println(harfler); // {H=44, K=70, M=10, S=40}

        harfler.put("Y",5);
        System.out.println(harfler); //{H=44, K=70, M=10, S=40, Y=5}

        harfler.replace("H",44,54);
        System.out.println(harfler); //{H=54, K=70, M=10, S=40, Y=5}


        harfler.replace("K",50,55);
        System.out.println(harfler); // {H=54, K=70, M=10, S=40, Y=5}

        harfler.remove("K"); // varsa remove eder
        System.out.println(harfler); // {H=54, M=10, S=40, Y=5}

        harfler.remove("Z"); // yoksa bir sey yapmaz
        System.out.println(harfler); // {H=54, M=10, S=40, Y=5}

        harfler.remove("M",5); // eger M'nin value su 5 ise remove eder yoksa dokunmaz
        System.out.println(harfler); //{H=54, M=10, S=40, Y=5}

        harfler.remove("S",40); // eger S'nin value su 40 ise remove eder yoksa dokunmaz
        System.out.println(harfler);//{H=54, M=10 , Y=5}

    }
}
