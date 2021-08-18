package com.company.foodorder;

import java.util.Scanner;

public class Pizza {
    private String small;
    private String medium;
    private String large;



    public void pizzaChoice(){
        this.small = small;
        this.medium = medium;
        this.large = large;

        //make a choice
        System.out.println("WELCOME TO MYPIZZA ORDERS");
        System.out.println("===============================================================");

        System.out.println("Enter a number to make a choice\n1 for small\n2 for medium\n3 large");
        Scanner input =  new Scanner(System.in);
        System.out.println("press:");
        int getPizzaChoice = input.nextInt();

        // small size
        if(getPizzaChoice == 1){
            System.out.println("Your choice is Small and it cost $20");
            int smallPizzaPrice = 20;


            System.out.println("=======================================================\n");
            System.out.println("Do you want extra cheese, vegetables or a drink\n");

        // For extra Pizza Additives
            System.out.println("Extra cheese cost $2\nExtra vegetables cost $4\nDrink cost $5\n");
            System.out.println("Enter a number for your extras:\n1 for Cheese\n2 for Vegetable\n3 for Drink\n4 to skip");
            System.out.println("press:");
            Scanner extraInput = new Scanner(System.in);
            int extraChoice = extraInput.nextInt();{

                    if(extraChoice == 1){
                        System.out.println("You choose Extra cheese");
                        smallPizzaPrice += 2;
                    }else if(extraChoice == 2){
                        System.out.println("You choose Extra vegetables");
                        smallPizzaPrice += 4;
                    }else if(extraChoice ==3){
                        System.out.println("You added a drink");
                        smallPizzaPrice += 5;
                    }else if (extraChoice == 4){
                        System.out.println("Skipped");
                    }else {
                        System.out.println("invalid input!!!");
                    }
                    int totalCost = smallPizzaPrice;
                    System.out.println("The total cost for your order is $" + totalCost);

            }

// For medium size
        }else if (getPizzaChoice == 2){
            System.out.println("your choice is Medium and it cost $30");
            int mediumPizzaPrice = 30;


            System.out.println("=======================================================\n");
            System.out.println("Do you want extra cheese, vegetables or a drink\n");

            // For extra Pizza Additives
            System.out.println("Extra cheese cost $2\nExtra vegetables cost $4\nDrink cost $5\n");
            System.out.println("Enter a number for your extras:\n1 for Cheese\n2 for Vegetable\n3 for Drink\n4 to skip");
            System.out.println("press:");
            Scanner extraInput = new Scanner(System.in);
            int extraChoice = extraInput.nextInt();{

                if(extraChoice == 1){
                    System.out.println("You choose Extra cheese");
                    mediumPizzaPrice += 2;
                }else if(extraChoice == 2){
                    System.out.println("You choose Extra vegetables");
                    mediumPizzaPrice += 4;
                }else if(extraChoice ==3){
                    System.out.println("You added a drink");
                    mediumPizzaPrice += 5;
                }else if (extraChoice == 4){
                    System.out.println("Skipped");
                }else {
                    System.out.println("invalid input!!!");
                }
                int totalCost = mediumPizzaPrice;
                System.out.println("The total cost for your order is $" + totalCost);

            }



    //   for large size

        }else if (getPizzaChoice == 3){
            System.out.println("Your choice is Large and it cost $40");
            int largePizza = 40;

            System.out.println("=======================================================\n");
            System.out.println("Do you want extra cheese, vegetables or a drink\n");

            // For extra Pizza Additives
            System.out.println("Extra cheese cost $2\nExtra vegetables cost $4\nDrink cost $5\n");
            System.out.println("Enter a number for your extras:\n1 for Cheese\n2 for Vegetable\n3 for Drink\n4 to skip");
            System.out.println("press:");
            Scanner extraInput = new Scanner(System.in);
            int extraChoice = extraInput.nextInt();{

                if(extraChoice == 1){
                    System.out.println("You choose Extra cheese");
                    largePizza += 2;
                }else if(extraChoice == 2){
                    System.out.println("You choose Extra vegetables");
                    largePizza += 4;
                }else if(extraChoice ==3){
                    System.out.println("You added a drink");
                    largePizza += 5;
                }else if (extraChoice == 4){
                    System.out.println("Skipped");
                }else {
                    System.out.println("invalid input!!!");
                }
                int totalCost = largePizza;
                System.out.println("The total cost for your order is $" + totalCost);

            }
         // wrong input

        }else {
            System.out.println("Wrong input try again!!!");
        }

    }



}
