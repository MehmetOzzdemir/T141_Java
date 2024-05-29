package day12_stringManipulation_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        // iki basamakli pozitif tam sayilearin toplamı
        System.out.println("**********************************");
        int sum = 0;
        int t = 0;
        for (int i = 10; i < 100; i++) {
            sum += i;
            System.out.print(i + " ");
            t++;
            if (t % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("**********************************");
        System.out.println(sum);
        System.out.println("**********************************");

        //10 ile 50 arasinda 9 ile bölünebilen sayilari toplayin
        sum=0;
        for (int i = 10; i <50 ; i++) {
            if (i%9==0){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println();
        System.out.println(sum);
        System.out.println("**********************************");

        //2 basamakli pozitif ve negatif tüm sayilarin toplamini yazdirin

        sum=0;
        for (int i = -99; i <100 ; i++) {
            if (!(i>-10&&i<10)){
                sum+=i;
            }

        }
        System.out.println(sum);

    }
}
