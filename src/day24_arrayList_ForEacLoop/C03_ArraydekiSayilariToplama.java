package day24_arrayList_ForEacLoop;

public class C03_ArraydekiSayilariToplama {
    public static void main(String[] args) {
        //Verilen it bir arraydeki
        //tum tek sayilari toplayip yazdirin

        int[] numbers = {3, 5, 6, 7, 3, 1, 2, 6, 5, 4};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }
        System.out.println("For Loop ile :  " + sum);

        sum = 0;
        for (int each : numbers) {//bana numbers arrayindeki herbir(each) int i getir
            if (each % 2 != 0) {
                sum += each;
            }
        }
        System.out.println("For Each ile : " + sum);
    }
}
