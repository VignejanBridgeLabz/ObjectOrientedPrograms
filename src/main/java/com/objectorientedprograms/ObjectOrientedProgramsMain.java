package com.objectorientedprograms;

import java.util.Scanner;

/**
 * UC2 - Modify class Account to provide a method called debit that withdraws money
 *
 * Requirements:
     *   (See PDF)
 *
 * @author  VignejanBridgeLabz
 * @version 1.0
 */
public class ObjectOrientedProgramsMain {

    public static void main(String[] args) {
        System.out.println("Welcome to ObjectOrientedPrograms");
        
        System.out.println("\n=== UC2: Modify class Account to provide a method called de ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to edit: ");
        String name = scanner.nextLine();
        // TODO: Implement edit logic
        System.out.println("Edit operation for: " + name);
        scanner.close();
    }
}
