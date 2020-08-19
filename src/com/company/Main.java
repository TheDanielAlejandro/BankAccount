package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1,1000,"Daniel","dani@gmail.com",392556567); // . creating a new object from the class BankAccount and setting all the fields.
     // BankAccount account1 = new BankAccount();                                                                       // . Creating a new object but using the default fields settings.

        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        account1.deposit(200,3);
        account1.withdraw(1300,3);

        VipCustomer customer1 = new VipCustomer("Daniel",9999,"Daniel@gmail.com");            // . Creating a new object from the class VipCustomer and setting all the fields.
     // VipCustomer customer1 = new VipCustomer();                                                                      // . Creating a new object but using the default fields settings.

        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());

     }
}
