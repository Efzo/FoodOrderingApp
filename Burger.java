package com.company.foodorder;

public class Burger {
    //declaring variable
    private int orderId;
    private String customerName;
    private String phoneNumber;
    private String orderName;
    private String orderType;

    //constructor
//    public Burger() {
//        setOrderId(1000);
//        setCustomerName("testname");
//        setPhoneNumber ("xxxx");
//        setOrderName("testOrder");
//        setOrderType("testType");
//    }

    // setters
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    public  void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setOrderName(String orderName){
        this.orderName = orderName;
    }
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }

    // getters
    public int getOrderId(){
        return orderId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getOrderName(){
        return orderName;
    }
    public String getOrderType(){
        return orderType;
    }

    // declaring variable for methods and total coast of Burger;
    double totalCost;  //c is the total cost in dollars
    double price;  // p is the cost of burger
    double deliveryCost; // t is the cost of delivery


    // method for determining Burger Price
    public double determineBurgerPrice(){
        if (getOrderName().equals("Pomodoro")){
            price = 22;
        }else if(getOrderName().equals("Valeriana")){
            price = 20;
        }else if (getOrderName().equals("Tuna")){
            price = 21;
        }else if(getOrderName().equals("Diavolo")){
            price = 27;
        }else if (getOrderName().equals("Salami picante")){
            price = 24;
        }
        else {
            System.out.println("Error: Incorrect order name has been enter. Make sure the name is spelt correctly");
       }
        return price;
    }

    // delivery - total cost
    public double totalCost(){
        if(getOrderType().equals("Pick-Up")){
            deliveryCost = 0;
        }
        else if (getOrderType().equals("Delivery")){
            deliveryCost = 7;
        }
    return totalCost = price + deliveryCost;
    }




}
