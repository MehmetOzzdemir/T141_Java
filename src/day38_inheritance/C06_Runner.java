package day38_inheritance;

public class C06_Runner {
    public static void main(String[] args) {

        C05_AvciKuslar kartalAvciKus = new C05_AvciKuslar();
        System.out.println(kartalAvciKus.hareket); // AVK ucarlar
        System.out.println(kartalAvciKus.solunum); // K akcigerle nefes alirlar
        System.out.println(kartalAvciKus.beslenme);// AVK et yerler
        System.out.println(kartalAvciKus.cogalma);// K yumurtayla cagalirlar
        System.out.println(kartalAvciKus.omur);// H yasar ve olurler
        System.out.println(kartalAvciKus.kanat); // K kanatlidirlar
        System.out.println(kartalAvciKus.gaga); // AVK sivri gagalidir
        System.out.println(kartalAvciKus.pence); // AVK penceleri vardir

        System.out.println();
        C04_Birds kartalKus = new C05_AvciKuslar();
        //Kuşlar Class'indaki Kartalin Ozelliklerini Verir
        System.out.println(kartalKus.hareket); // H hareket ederler
        System.out.println(kartalKus.solunum); // K akcigerle nefes alirlar
        System.out.println(kartalKus.beslenme);// H beslenirler
        System.out.println(kartalKus.cogalma);// K yumurtayla cagalirlar
        System.out.println(kartalKus.omur);// H yasar ve olurler
        System.out.println(kartalKus.kanat); // K kanatlidirlar
        System.out.println(kartalKus.gaga); // K gagalari vardir
        //System.out.println((kartalKus).pence); // kuslar veya hayvanlarda yok CTE verir

        System.out.println();
        //Hayvanlar Class'indaki Kartalin Ozelliklerini Verir
        C03_Animals kartalHayvan = new C05_AvciKuslar();
        System.out.println(kartalHayvan.hareket); // H hareket ederler
        System.out.println(kartalHayvan.solunum); // H akcigerle nefes alirlar
        System.out.println(kartalHayvan.beslenme);// H beslenirler
        System.out.println(kartalHayvan.cogalma);// H yumurtayla cagalirlar
        System.out.println(kartalHayvan.omur);// H yasar ve olurler
        //System.out.println((kartalHayvan).kanat); // CTE
        //System.out.println((kartalHayvan).gaga); // CTE
        //System.out.println((kartalHayvan).pence); // CTE

        System.out.println("***************************");

        C04_Birds birds1 = new C04_Birds();
        System.out.println(birds1.hareket); // H  hareket ederler
        System.out.println(birds1.solunum); // K akcigerle nefes alirlar
        System.out.println(birds1.beslenme);// H beslenirler
        System.out.println(birds1.cogalma);// K yumurtayla cagalirlar
        System.out.println(birds1.omur);// H yasar ve olurler
        System.out.println(birds1.kanat); // K kanatlidirlar
        System.out.println(birds1.gaga); // K gagalari vardir
        // System.out.println(birds1.pence); // CTE
        System.out.println("***************************");

        C03_Animals birdAnimal = new C04_Birds();
        System.out.println(birdAnimal.hareket); // H hareket ederler
        System.out.println(birdAnimal.solunum); // H nefes alirlar
        System.out.println(birdAnimal.beslenme);// H beslenirler
        System.out.println(birdAnimal.cogalma);// H cagalirlarr
        System.out.println(birdAnimal.omur);// H yasar ve olurler
        //System.out.println(birdAnimal.kanat); // CTE
        // System.out.println(birdAnimal.gaga); // CTE
        // System.out.println(birds1.pence); // CTE

        System.out.println("******************************");

        C03_Animals animals = new C03_Animals();

        System.out.println(animals.hareket); // H hareket ederler
        System.out.println(animals.solunum); // H nefes alirlar
        System.out.println(animals.beslenme);// H beslenirler
        System.out.println(animals.cogalma);// H cogalirlar
        System.out.println(animals.omur);// H yasar ve olurler
        //System.out.println(animals.kanat); // CTE
        // System.out.println(animals.gaga); // CTE
        // System.out.println(animals.pence); // CTE


    }
}
