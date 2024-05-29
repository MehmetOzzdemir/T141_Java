package day19_arrays;

public class C07_EnUzunVeEnKısaKelime {
    public static void main(String[] args) {
        String[] arr = {"Meltem", "Seren", "Emrah", "Ali", "Ahmet", "Semih","Mustafa"};
        enUzunVeKisaKelime(arr);

    }

    public static void enUzunVeKisaKelime(String[] arr) {
        String enUzun = arr[0];
        String enKisa = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > enUzun.length()) {
                enUzun = arr[i];
            } else if (arr[i].length() < enKisa.length()) {
                enKisa = arr[i];
            }

        }
        System.out.println("En Uzun Kelime : " + enUzun);
        System.out.println("En Kisa Kelime : " + enKisa);
    }
}
