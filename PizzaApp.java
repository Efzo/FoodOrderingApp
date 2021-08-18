package com.company.foodorder;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        int ch;
        do {
            pizza.pizzaChoice();
            System.out.println("Do you want to add more choice");
            Scanner input1 = new Scanner(System.in);
            ch  = input1.nextInt();
        }while(ch!=0);


    }
}
