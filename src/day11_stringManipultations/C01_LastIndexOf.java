package day11_stringManipultations;

public class C01_LastIndexOf {
    public static void main(String[] args) {

        String str = "Java cok zevkli.";
        //metnin kac karakter olduğunu
        System.out.println(str.length());
        //son karakteri yazdırın
        System.out.println(str.charAt(str.length() - 1));
        //str da z harfii kullanılmış mı
        System.out.println(str.contains("z"));//true
        //str da ilk k nın index i ne
        System.out.println(str.indexOf('k'));
        //str da çok kelimesinin indexini yazdırın
        System.out.println(str.indexOf("cok"));
        //str da k nın son son kullanımını yazdirin
        System.out.println(str.lastIndexOf("k"));
        //str da son k dan bir önceki k nin indexini yazdirin
        System.out.println(str.lastIndexOf("k",12-1));
        //str da kullanılan son cok kelimesinin indexini yazdirin
        System.out.println(str.lastIndexOf("cok"));
        //metinde kullanilan ilk x harfinin indexini yazdırın
        System.out.println(str.indexOf("x"));//olmadigi icin -1 dönder
        //str da kullanilan son w harfini yazdirin
        System.out.println(str.lastIndexOf("w"));//olmadigi icin -1 dönder

    }
}
