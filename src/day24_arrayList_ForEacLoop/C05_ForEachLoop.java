package day24_arrayList_ForEacLoop;

public class C05_ForEachLoop {
    public static void main(String[] args) {
        //verilen integer arraydeki her elementin karesinii alip
        //karelerinin toplamini yazdiran bir method olusturun

        int[] arr = {3, 2, 4, 1};
        karelerinToplami(arr);
    }


    public static void karelerinToplami(int[] arr) {
        int sum = 0;
        for (int each : arr) {
            sum += (each * each);
        }
        System.out.println("Arraydeki Sayilarin Kareleri Toplami : " + sum);
    }
}
