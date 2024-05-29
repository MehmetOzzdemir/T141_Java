package day08_ternary_switchStatements;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many product buy ?");
        int product = scan.nextInt();
        System.out.println("How much your product cost ? ");
        double cost = scan.nextDouble();
        System.out.println("Do you Have Discount Card ? ");
        char discountCard = scan.next().toUpperCase().charAt(0);

        if (discountCard == 'Y') {
            if (product > 10) {
                double totalCost = (product * cost) * (0.80);
                System.out.println("For %20 Discount Total Payment " + totalCost);
            } else if (product > 0) {
                double totalCost = (product * cost) * (0.85);
                System.out.println("For %15 Discount Total Payment " + totalCost);
            } else {
                System.out.println("Error Valid");
            }
        } else if (discountCard == 'N') {
            if (product > 10) {
                double totalCost = (product * cost) * (0.85);
                System.out.println("For %15 Discount Total Payment " + totalCost);
            } else if (product > 0) {
                double totalCost = (product * cost) * (0.90);
                System.out.println("For %10 Discount Total Payment " + totalCost);
            } else {
                System.out.println("Error Valid");
            }
        } else {
            System.out.println("Error Valid");
        }

    }
}
