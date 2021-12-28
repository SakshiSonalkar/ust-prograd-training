package com.bankApplication.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAccount {
    public void displayAccountDetails(Customer customer){
            customer.displayCustomerDetails();
            System.out.println("Account Balance: ");
            customer.accountBalanceList.forEach((k,v) -> System.out.println(" Account ID= " + k + ", Balance = " + v));
            System.out.println();
        }
    }






























//    BankAccount:To store information about the existing accounts of the bank