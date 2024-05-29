package day09_switchStatements_stringManipulations;

public class C05_charAt {
    public static void main(String[] args) {
        String str = "Java Candir can.";
        System.out.println(str.charAt(0));

        //Metindeki ikinci harfi büyük harf olarak yazdırın
        System.out.println(str.toUpperCase().charAt(1));

        //Sonuncu harfi yazdırın
        System.out.println(str.charAt(10));

        // Sondan 3.Harfi yazdırın
        //Bu kod dinamik olmaz sondan 3. harfi değil 8. indexi verir
        System.out.println(str.charAt(8));

        //Bir String deki karakter sayısına o String'in length'i denir
        //length 1'den başlar indez 0'dan
        //str için düşünürsek, length ==> 11,Son karakterin index'i ==> (length-1)

        //Dinamik kod
        //kullanıcıdan alınan input 'a bağlı olmaksızın
        //her zaman kendini dinamik olarak düzenleyen
        //istenen sonucu veren koddor


        //sonuncu harfi yazdırın
        System.out.println(str.charAt(str.length() - 1));

        //sondan 3. harfi yazdırın
        System.out.println(str.charAt(str.length() - 2));

        System.out.println("Length : "+str.length());
        //System.out.println(str.charAt(16));//16 ==> length
        //Girilen index sınırların dışında

        //Java Compile Time (çalıştırmadan önce)
        //kıllanılan variable'ların değerlerini göremez
        //sadece data türlerini görür

        /*
        data türleri açısından kod'da bir sorun varsa
        compile time'da bunu farkeder ve altını çizer
        Compile Time ERROR (CTE) diyoruz
         */

        /*
        ama değeri öğrenmediği için
        yanlış değerlerin sebep olacağı hataları
        Compile Time'da fark eder
        değer hatalarını kodları çalıştırmaya başladıktan sonra farkeder
        Bu tür hatalara çalışmaya başladıktan sonra farkedildiği için
        Run Time Error (RTE)
         */
    }
}
