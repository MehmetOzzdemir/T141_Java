package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C06_Discount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many product buy ?");
        int product = scan.nextInt();
        System.out.println("How much your product cost ? ");
        double cost = scan.nextDouble();
        System.out.println("Do you Have Discount Card ? ");
        char discountCard = scan.next().toUpperCase().charAt(0);

        if (discountCard=='Y'){
            if (product>10){
                double totalCost = (product*cost)*(0.80);
                System.out.println("Total Payment "+totalCost);
            }else {
                double totalCost = (product*cost)*(0.85);
                System.out.println("Total Payment "+totalCost);
            }
        }else if (discountCard=='N'){
            if (product>10){
                double totalCost = (product*cost)*(0.85);
                System.out.println("Total Payment "+totalCost);
            }else {
                double totalCost = (product*cost)*(0.90);
                System.out.println("Total Payment "+totalCost);
            }
        }else {
            System.out.println("Error Valid");
        }
        }


    }

