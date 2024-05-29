package day04_wrapperClassAndMathatematic;

public class C09_Pre_Post_Increment {
    public static void main(String[] args) {
        //Java sayı++ ve sayı--  işlemlerine özel olarak
        // ++sayı ve --sayı şeklinde yazılabilme özelliği vermiştir
        // sayı++ ve sayı-- sonuç olarak anı işlemi yapar
        //Aralırndaki fark işlemin yapıldığı satırda ikinci bir işlem olursa ortaya çıkar

        int sayi = 20;
        sayi++;
        //Bir sonraki satırda yazdırırsak
        System.out.println(sayi);

        int a = 20;
        ++a;
        //Bir sonraki satırda yazdırırsak
        System.out.println(a);
        System.out.println("------------------");
        int b = 20;
        System.out.println("b : " + b++);
        int c = 20;
        System.out.println("c : " + ++c);
        //İşlemin yapıldığı satırdan sonra aralırnda hiçbir fark yoktur
        //İkiside variable ları bir arttırdı
        System.out.println("b : " + b + " ,c : " + c);

        int d = 10;
        int e = ++d;
        System.out.println("d : " + d + " ,e : " + e);

        int f = 20;
        int g = f++;
        System.out.println("f : " + f + " ,g : " + g);

    }
}
