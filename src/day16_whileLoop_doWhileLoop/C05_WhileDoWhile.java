package day16_whileLoop_doWhileLoop;

public class C05_WhileDoWhile {
    public static void main(String[] args) {

        int num = 20;
        while (num < 10) {
            System.out.println("While loop body'si calisti");
            num--;
        }

        //Atanan ilk deger icin while konrolü false olduğundan
        //loop body si hic calismadan loop biter


        do {
            System.out.println("While loop body'si calisti");
            num--;
        } while (num < 10);

        //ilk deger kontrol edilmeden once
        //loop body si bir kere calisir
        //Bu durmda ilk deger uygun olmasa bile
        //Loop body'si bir kere calismis olur

        //Do-While loop'un + si da - si de aynidir
        //kontrol edilmeden  once body bir kere calisir
        //bu ozellik bazen avanta,bazen de dezavantaj olabiir
    }
}
