package org.JSP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logic {

    public void calculateTickets() {
        Scanner sc = new Scanner(System.in);
        List<PersonInfo> personInfoList = new ArrayList<>();

        System.out.print("Enter the number of persons:    ");
        int num = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Collect details for each person
        for (int i = 0; i < num; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            PersonInfo person = PersonInfo.getInfo(sc);
            personInfoList.add(person);
        }

        // Calculate total cost
        double ticketPrice = 400.0;
        double total = num * ticketPrice;
        if (num >= 5) {
            double discount = 0.1 * total;
            total -= discount;
            System.out.println("\nA discount of 10% is applied for group bookings of 10 or more.");
        }

        // Print detailed bill
        System.out.println("\n--- Bill Summary ---");
        for (int i = 0; i < personInfoList.size(); i++) {
            PersonInfo person = personInfoList.get(i);
            System.out.println((i + 1) + ". Name: " + person.getName() + " | Ticket Price: Rs. " + ticketPrice);
        }
        System.out.println("Total Cost: Rs. " + total);
    }

}
