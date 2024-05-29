package day19_arrays;

import java.util.Arrays;

public class C02_ElemanlariToplama {
    public static void main(String[] args) {
        //verilen bir int array'deki tum elementleri toplayip yazdiran bir method olusturun

        int[] nums = {3, 4, 5, 6};
        elementToplamiYazdir(nums);
        //nums[4]=8;//ArrayIndexOutOfBoundsException


        int[] newArrays = {3, 2, 5, 6, 8};
        nums = newArrays;
        System.out.println("Nums Arrays New : "+ Arrays.toString(nums));
        elementToplamiYazdir(nums);


    }

    public static void elementToplamiYazdir(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("verilen Array'deki Elementlerin Toplami : " + sum);
    }
}
