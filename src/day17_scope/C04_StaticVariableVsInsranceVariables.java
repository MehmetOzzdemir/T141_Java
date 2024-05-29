package day17_scope;

public class C04_StaticVariableVsInsranceVariables {

    static String hospitalName = "OZDEMIR HOSPITAL";
    static String majorDoctor  = "DR. Mehmet OZDEMR";
    static String hospitalAddress = "Gaziemir";

    String persName ;
    String persAddress ;
    String persTel;

    public static void main(String[] args) {
        C04_StaticVariableVsInsranceVariables personal1 = new C04_StaticVariableVsInsranceVariables();
        System.out.println(personal1.persAddress);

        personal1.persName="Metehan Üst";
        personal1.persAddress="Kemalpasa";
        personal1.persTel = "5444524533";

        System.out.println(personal1.persAddress);
        System.out.println(majorDoctor);


        C04_StaticVariableVsInsranceVariables personal2 = new C04_StaticVariableVsInsranceVariables();
        System.out.println(personal2.persName);
    }


}
