package day50_maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_ComputeMethodlari {
    public static void main(String[] args) {
        Map<String, Integer> harfler = new TreeMap<>();

        harfler.put("S", 40);
        harfler.put("H", 20);
        harfler.put("K", 50);
        harfler.put("M", 10);

        System.out.println(harfler); // {H=20, K=50, M=10, S=40}


        //mape L harfini degeri 20 olarak ekleyin
        harfler.put("L", 20);
        System.out.println(harfler); //{H=20, K=50, L=20, M=10, S=40}

        //Eger map devarsa S harfinin degerini 50 olarak update edin
        harfler.replace("S", 50);
        System.out.println(harfler); //{H=20, K=50, L=20, M=10, S=50}

        //eger map de varsa Y harfinin degerini 25 olarak update edin
        harfler.replace("Y", 25);
        System.out.println(harfler);//{H=20, K=50, L=20, M=10, S=40}


        //Eger map de yoksa X harfini degeri 44 olarak ekleyin

        if (!harfler.containsKey("X")) {
            harfler.put("X", 44);
        }
        System.out.println(harfler);//{H=20, K=50, L=20, M=10, S=50, X=44}


        //Eger map de yoksa L harfini degeri 45 olarak ekleyim
        if (!harfler.containsKey("L")) {
            harfler.put("L", 44);
        }
        System.out.println(harfler); //{H=20, K=50, L=20, M=10, S=50, X=44}

        //Eger map de yoksa Y harfinin degeri 45 olarak ekleyin
        harfler.putIfAbsent("Y", 45);
        System.out.println(harfler); //{H=20, K=50, L=20, M=10, S=50, X=44, Y=45}


        //H harfinin degerini 2 katina cikarin
        int eskiDeger = harfler.get("H"); //20
        harfler.replace("H", 2 * eskiDeger);
        System.out.println(harfler); //{H=40, K=50, L=20, M=10, S=50, X=44, Y=45}


        //K harfinin degerini 10 azaltin
        harfler.compute("K", (k, v) -> v - 10);
        System.out.println(harfler.get("K")); // 40


        //S harfinin degerini,eski degerinin 2 katinin 5 eksik olacak sekilde degisitirin
        harfler.compute("S", (a, b) -> b * 2 - 5);
        System.out.println(harfler.get("S")); // 95

        //Eger map de varsa L harfinin degerini 5 artirin
        int a = harfler.get("L");
        harfler.replace("L", a + 5);
        System.out.println(harfler); // {H=40, K=40, L=25, M=10, S=95, X=44, Y=45}

        harfler.computeIfPresent("L", (k, v) -> v + 5);
        System.out.println(harfler.get("L")); //30

        //eger map d e varsa Z harfinin degerini 3, katina cikarin
        harfler.computeIfPresent("Z", (k, v) -> v * 3);
        System.out.println(harfler); // {H=40, K=40, L=30, M=10, S=95, X=44, Y=45}

        //Z harfi yoksa degeri 15 olarak ekleyin

        harfler.putIfAbsent("Z", 15);
        System.out.println(harfler); //{H=40, K=40, L=30, M=10, S=95, X=44, Y=45, Z=15}

        //A yoksa degerini 1 olarak ekleyin
        harfler.computeIfAbsent("A", v -> 1);
        System.out.println(harfler); // {A=1, H=40, K=40, L=30, M=10, S=95, X=44, Y=45, Z=15}




    }
}
