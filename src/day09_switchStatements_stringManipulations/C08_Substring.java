package day09_switchStatements_stringManipulations;

public class C08_Substring {
    public static void main(String[] args) {
      /*
      Sadece bu method için değil ,Javanın genelinde
      başlangıç indexleri inclusive(dahil)
      bitiş indexleri exclusive(hariç)'dir
       */

        String str = "java güzeldir";

        System.out.println(str.substring(5,8));//güz

        //5.Index başla 8. index hariç olarak aradaki karakterler
        //5.indexten başla (8-5) karakter yaz //güz

        System.out.println(str.startsWith("a",3));
    }
}
