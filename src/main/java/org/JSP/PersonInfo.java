package org.JSP;

import java.util.Scanner;

public class PersonInfo {
    private String name;

    public PersonInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static PersonInfo getInfo(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = "";
        while (name.isBlank()) {
            name = sc.nextLine();
        }
        return new PersonInfo(name);
    }
}
