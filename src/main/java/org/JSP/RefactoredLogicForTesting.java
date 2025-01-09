package org.JSP;

import java.util.Scanner;

public class RefactoredLogicForTesting {
    // Method to calculate total ticket cost
    public double calculateTotalCost(int numPersons) {
        double costPerPerson = 400.0;
        double total = numPersons * costPerPerson;
        if (numPersons > 5) {
            total -= total * 0.10; // 10% discount for groups of more than 5
        }
        return total;
    }

    public void CalculateTicket() {
        System.out.println("Enter the number of persons:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < num; i++) {
            PersonInfo.getInfo(sc);
        }

        double totalCost = calculateTotalCost(num);
        System.out.printf("The total cost is Rs. %.2f%n", totalCost);
    }
}
