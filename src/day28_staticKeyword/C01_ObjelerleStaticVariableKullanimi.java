package day28_staticKeyword;

public class C01_ObjelerleStaticVariableKullanimi {


    public static void main(String[] args) {

        C00_Hospital nurse1 = new C00_Hospital();
        System.out.println(nurse1.PersonalName); //No Valid
        System.out.println(nurse1.PersonalAdreess); // No Valid
        System.out.println(nurse1.PersonalTel); // No Valid

        System.out.println(nurse1.hospitalName); //Yildiz Hospital
        //Static member 'hospitalName' accessed via instance referance
        System.out.println(C00_Hospital.hospitalName);//Yildiz Hospital
        System.out.println();

        System.out.println(nurse1.majorDoctorName); // Ilgar
        System.out.println(C00_Hospital.majorDoctorName);// Ilgar
        System.out.println();

        nurse1.PersonalName = "Meltem";
        nurse1.PersonalAdreess = "Sincan";
        nurse1.hospitalAdreess = "Yenimahalle";

        System.out.println(nurse1.PersonalName);// Meltem
        System.out.println(nurse1.PersonalAdreess);// Sincan
        System.out.println(nurse1.hospitalAdreess); //Yenimahalle
        System.out.println();

        C00_Hospital nurse2 = new C00_Hospital();
        System.out.println(nurse2.PersonalName); //No Valid
        System.out.println(nurse2.PersonalAdreess); // No Valid
        System.out.println(nurse2.PersonalTel); // No Valid
        System.out.println(nurse2.hospitalAdreess); // Yenimahalle
        System.out.println();

        nurse2.PersonalName = "Sümeyra";
        nurse2.PersonalAdreess = "Altindag";
        nurse2.PersonalTel = "0231323131";
        nurse2.majorDoctorName = "Ramazan";
        nurse2.hospitalAdreess = "Altindag";

        C00_Hospital nurse3 = new C00_Hospital();

        System.out.println(nurse3.PersonalName); //No Valid
        System.out.println(nurse3.PersonalAdreess); // No Valid
        System.out.println(nurse3.PersonalTel); // No Valid
        System.out.println();

        System.out.println(nurse1.hospitalAdreess);// Altindag
        System.out.println(nurse2.hospitalAdreess);// Altindag
        System.out.println(nurse3.hospitalAdreess);// Altindag
        System.out.println();
        System.out.println(nurse1.PersonalName); // Meltem
        System.out.println(nurse2.PersonalName); // Sumeyra
        System.out.println(nurse3.PersonalName); // No Valid


    }
}
