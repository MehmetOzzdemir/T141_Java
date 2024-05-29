package day32_dateTime_Varargs;

public class C04_Varargs {
    public static void main(String[] args) {

        varargs(3, 53, 3, 32, 3, 1, 2, 3, 4, 5);
        varargs(2);
        varargs(2, 3, 4);
        varargs(2, 4, 5, 6, 7);
        varargs(0, 25, 5, 5, 5, 5);
    }

    public static void varargs(int firstNumber, int... numbers) {
        int sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum * firstNumber);
    }
}
