package com.company;

public class BankAccount {                                                                                              // . Creating the class "BankAccount".

    private int accountNumber;                                                                                          // . Initializing all the fields of the class.
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // CONSTRUCTORS

    public BankAccount() {                                                                                              // . Creating a constructor with default values, the object will have this values if we don't pass any parameters.
        this(0,0,"Unknown name","Unknown email", 0);
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {         //Constructor with all the parameters that correspond all the fields of the class.
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    // SET METHODS                                                                                                      // . Creating the methods for setting the values (setAccountNumber/Balance/CustomerName/Email/PhoneNumber) for each field.

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setBalance(double balance){
        this.balance = balance;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void setEmail(String email){
        this.email = email;
    }


    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public int getAccountNumber(){
        return accountNumber;
    }


    // GET METHODS                                                                                                      // . Creating the methods to get the values (getAccountNumber/Balance/CustomerName/Email/PhoneNumber) for each field.

    public double getBalance(){
        return balance;
    }


    public String getCustomerName(){
        return customerName;
    }


    public String getEmail(){
        return email;
    }


    public int getPhoneNumber(){
        return phoneNumber;
    }


    // OTHER METHODS

    public void deposit(double amount, int accountNumber){                                                              // . Creating method deposit where we pass the amount we would like to deposit and the account number we would like to use ( in case one person has multiples account numbers or none).
        if(accountNumber == this.accountNumber){                                                                        // . Check if account number correspond.
            balance += amount ;                                                                                         // . Increment the balance of the amount inserted
            System.out.println("Your deposit has been processed! Your balance now is: " + balance +"$");                // . Printing the result of the transaction, if postive will display the final balance, if negative will display "Account not found".
        }else{
            System.out.println("Account not found.");
        }
    }


    public void withdraw(double amount, int accountNumber){                                                             // . Creating method withdraw where we pass the amount we would like to withdraw and the account number we would like to use ( in case one person has multiples account numbers or none).
        if(accountNumber == this.accountNumber){                                                                        // . Checking if the account number correspond.
            if(this.balance < amount){                                                                                  // . The account number corresponds, checking if the amount desired to withdraw is superior to the funds available.
                System.out.println("Insufficient funds.");                                                              // . The amount is superior of the balance, print "insufficient funds".
            }else{                                                                                                      // . The amount is inferior of the balance, detract the amount from the balance, and print the result of the transaction and display the balance.
                balance -= amount;
                System.out.println("Withdraw completed! Your balance now is: " + balance + "$");
            }
        }else{
            System.out.println("Account not found.");

        }
    }
}

