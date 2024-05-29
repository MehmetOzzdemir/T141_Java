package day36_encapsulation_inheritance;

public class C10_Runner {
    public static void main(String[] args) {
        C09_Corolla corolla = new C09_Corolla();

        System.out.println(corolla.fuel); // Car No Fuel Information
        System.out.println(corolla.year); // Car 1900

        System.out.println(corolla.brand); // Toyota Toyota
        System.out.println(corolla.energy); // Toyota Inci Aku
        System.out.println(corolla.security); // Toyota ABS

        System.out.println(corolla.model); // Corolla
        System.out.println(corolla.productionPlace); // Corolla Sakarya
        System.out.println(corolla.body); // Corolla Corolla's Body
        System.out.println(corolla.wheel); // Corolla 15 inch Pirelli Wheel
        System.out.println(corolla.engine); // Corolla CVVTI
    }
}
