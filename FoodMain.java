package com.company.foodorder;
import java.util.Scanner;

//**  Efosa Ojomo code   **//

public class FoodMain {
    public static void main(String[] args) {
        Food food[] = new Food[100];
        System.out.println("WELCOME TO FOOD ORDER APP");
        System.out.println("================================");

        // determine order price
        int i = 0;
        int operation = 1;
        int addItem=0;
        do {
            //i=iceCream[i].
            food[i] = new Food();
            food[i].determineOrder();
            food[i].delivery();
            food[i].customerPhoneInfo();
            food[i].customerAddressInfo();
            food[i].ticketCode();
            System.out.println("");

            i++;

            System.out.println("Do you want to add an item to your order? 1/0 :");
            Scanner sc = new Scanner(System.in);
            addItem   = sc.nextInt();

        }while (i<100 && addItem==1);

//            //to choose the Delivery address
//        System.out.println();
//        if (food[i].customerAddressInfo().equals("1")){
//            System.out.println(food[i].officeAddress);
//        }else {
//            System.out.println(food[i].homeAddress);
//        }


        System.out.println("   NAME     ORDER    PHONE NO  TICKET NO   COST($)  ");
        for (int j = 0; j < i ; j++) {
            food[j].info();
        }

    }
}
