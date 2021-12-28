package com.bankApplication.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class FundTransfer {
    @Autowired
    public BankAccount account;
    public void fundTransfer(Double amount,Customer customer1,Integer accountId1,Customer customer2,Integer accountId2) {
        if (customer1.accountBalanceList.containsKey(accountId1) && customer2.accountBalanceList.containsKey(accountId2) ) {
            customer1.accountBalanceList.replace(accountId1, customer1.accountBalanceList.get(accountId1) - amount);
            System.out.println("The amount " + amount + "  is debited " + " from account number "+ accountId1 + " to account number "+ accountId2);
            account.displayAccountDetails(customer1);
            customer2.accountBalanceList.replace(accountId2, customer2.accountBalanceList.get(accountId2) + amount);
            System.out.println("The amount " + amount + "  is credited " + " to  account number "+ accountId2+" from account number"+ accountId1);
            account.displayAccountDetails(customer2);
        }
    }
}














//    FundTransfer: To store information about the funds that are transferred from one account to the other.