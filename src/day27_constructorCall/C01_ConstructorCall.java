package day27_constructorCall;

public class C01_ConstructorCall {

    C01_ConstructorCall() { //Constructor 1
        //cons2 cagiralim
        this("Java"); //constructor call ilk satirda olmalidir
    }

    void C01_ConstructorCall() { // Method 1

    }

    C01_ConstructorCall(String str) { // Constructor 2

    }

    C01_ConstructorCall(int a) { // Constructor 3
        //C01_ConstructorCall("Java"); // bu syntax method call icindir
        //isin() : bu sytnax method call icindir
        this(); // constructor call bu syntax ile calisir

    }

    int C01_ConstructorCall(double d) { //Method 2
        C01_ConstructorCall();
        return 0;
    }


    public static void main(String[] args) {

    }
}
