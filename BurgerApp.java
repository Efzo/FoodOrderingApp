package com.company.foodorder;

import java.util.Scanner;

public class BurgerApp {
    public static void main(String[] args) {
        //declare variable
        int numberOfBurgerOrdered;
        int numberOfCurrentBurger = 1;

        // declare input Scanner
        Scanner numberOfBurgerOrderScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        //Adding a new Order
        System.out.println("Burger Order manager");
        System.out.println("===================");
        System.out.println("");
        System.out.println("Enter number of Burger Order: ");
        numberOfBurgerOrdered = numberOfBurgerOrderScanner.nextInt();
        System.out.println("");

        // declaring a counter
        int i = 1;

        // creating a loop to display entry level of Burger
        while (i <= numberOfBurgerOrdered){
            System.out.println("Enter details of Burger " + numberOfCurrentBurger + ":");
            System.out.println("===============================");

            // Details for new order
            Burger p1 = new Burger();
            System.out.println("Order ID :");
            p1.setOrderId(scanner.nextInt());

            if(p1.getOrderId() <= 1000){
                System.out.println("Please a number higher than 1000");
                p1.setOrderId(scanner.nextInt());
            }

            scanner.nextLine();
            System.out.println(" Customer Name: ");
            p1.setCustomerName(scanner.nextLine());
            System.out.println("Customer Phone number: ");
            p1.setPhoneNumber(scanner.nextLine());
            System.out.println("Order Name: ");
            p1.setOrderName(scanner.nextLine().trim());
            System.out.println("Type (Pick-up or Delivery) : ");
            p1.setOrderType(scanner.nextLine());

            // Display Burger Order details
            System.out.println("");
            System.out.println("Details of Burger order: " + numberOfCurrentBurger + ":");
            System.out.println("==============================");
            System.out.println("Order ID:" + p1.getOrderId());
            System.out.println("Customer Name: " + p1.getCustomerName());
            System.out.println("Customer Phone number: " + p1.getPhoneNumber());
            System.out.println("");

            System.out.println("Order Name: " + p1.getOrderName());
            System.out.println("Type (Pick-up or Delivery):" + p1.getOrderType());
            System.out.println("Burger Cost $: " + p1.determineBurgerPrice());
            //System.out.println("Delivery Cost $: " + p1.deliveryCost);
            System.out.println("Calculate total cost $: " + p1.totalCost());

            numberOfCurrentBurger += 1;
            i++;

        }

    }
}
