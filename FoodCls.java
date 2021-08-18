package com.company.foodorder;

import java.util.Scanner;

class Food {
    private  String orderName;
    private int orderInfo;
    private  String customerName;
    private  String customerPhoneNumber;
    private String customerAddress;
    private  int orderPrice;
    public static int ticket = 0;
    static String officeAddress = "115b Traugutta Street\n80-226 Gdansk";
    static String homeAddress;



    //setters
    public void setOrderName(String orderName){
        this.orderName = orderName;
    }
    public  void setOrderInfo(int orderInfo){
        this.orderInfo = orderInfo;
    }
    public  void setCustomerName(String customerName){

        this.customerName = customerName;
    }
    public  void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public  void setCustomerAddress (String customerAddress){
        this.customerAddress = customerAddress;
    }
    public void setOrderPrice(int orderPrice){
        this.orderPrice = orderPrice;
    }




    // getters
    public String getOrderName(){
        return orderName;
    }
    public int getOrderInfo(){
        return orderInfo;
    }
    public String getCustomerName(){
        return customerName;
    }
    public  String getCustomerPhoneInfo(){
        return customerPhoneNumber;
    }
    public  int getOrderPrice(){
        return orderPrice;
    }



    // Determine order Price
    int price;
    String choice;

    public double determineOrder(){
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        setCustomerName(scannerInput.nextLine());
        System.out.println("What ice cream flavour do you want " + getCustomerName());

        System.out.println("");
        System.out.println("1. bacon\n2. Banana\n3. Butter Melt\n4. Cheese\n5. Cherry\nEnter number here: ");
        setOrderName(scannerInput.nextLine());
        while(getOrderName().compareTo("5")>0 || getOrderName().compareTo("1")<0){
            System.out.println("INVALID CHOICE. PLEASE CHOSE AGAIN!!\nEnter number here: ");
            setOrderName(scannerInput.nextLine());
        }

        if(getOrderName().equals("1")){
            orderName = "Bacon";
            price = 24;
            System.out.println("You choose " + getOrderName() + " flavour and the price is $" + price);
        }else if (getOrderName().equals("2")) {
            orderName = "Banana";
            price = 26;
            System.out.println("You choose " + getOrderName() + " flavour  and the price is $" + price);
        }else if (getOrderName().equals("3")) {
            orderName = "Butter Melt";
            price = 30;
            System.out.println("You choose " + getOrderName() + " flavour and the price is $" + price);
        }else if (getOrderName().equals("4")) {
            orderName = "Cheese";
            price = 15;
            System.out.println("You choose " + getOrderName() + " flavour and the price is $" + price);
        }else if (getOrderName().equals("5")) {
            orderName = "Cherry";
            price = 18;
            System.out.println("You choose " + getOrderName() + " flavour and the price is $" + price);
        }else {
            System.out.println("Error: choose the flavour number and try again!!!");
            return determineOrder();
        }

        return orderPrice += price;
    }


    int  pickUp = 0;
    int homeDelivery = 4;
    int newPrice = orderPrice;

    //to determine delivery

    public double delivery(){
        System.out.println("Enter number to choose preferred delivery method:\n1. pickUp\n2. Home delivery\n");
        Scanner deliveryInput = new Scanner(System.in);
        int choice = deliveryInput.nextInt();
        if (choice == 1){
            System.out.println("You chose PICK-UP and it cost $0");
           return  newPrice = orderPrice + pickUp;
        }else if (choice == 2){
            System.out.println("You chose HOME DELIVERY and it cost $4");
            return newPrice = orderPrice + homeDelivery;
        }else {
            System.out.println("Error: invalid choice, try again!!!");
        }
     return newPrice;
    }


    // gets customer phone number;
    public  String customerPhoneInfo(){
        Scanner contactInput = new Scanner(System.in);
        System.out.println("Please Enter Phone number:");
        setCustomerPhoneNumber(contactInput.nextLine());
        return customerPhoneNumber;
    }

    // get home address details

    public  String customerAddressInfo(){
        Scanner contactInput = new Scanner(System.in);
        System.out.println("Please enter Home Address:");
        homeAddress =  contactInput.nextLine();
        setCustomerPhoneNumber(contactInput.nextLine());
        return customerAddress;
    }

    // booking ticket
    public int ticketCode(){
        //Random rand = new Random();
        //int upperbound = 1000;
        int bookingCode = ticket;
        ticket++;      //rand.nextInt(upperbound);
        return bookingCode;
    }

    // get booking info
    public int info(){
        System.out.format("%10s%10s%10s%10d%10d", getCustomerName(), getOrderName(), customerPhoneNumber,ticketCode(), newPrice);
     return orderInfo;
    }




}
