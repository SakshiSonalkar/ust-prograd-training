package com.bankApplication.Bank;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Component
@Scope("prototype")
public class Customer {

    private String name,phoneNo,accountType;
    private Integer customerId,accountId;
    private Double accountBalance;

    LinkedHashMap<String,Integer> accountList = new LinkedHashMap<>();
    LinkedHashMap<Integer,Double> accountBalanceList= new LinkedHashMap<>();

    public void setCustomerDetails(String name,String phoneNo,Integer customerId){
        setName(name);
        setPhoneNo(phoneNo);
        setCustomerId(customerId);

    }

    public void setAccountDetails(String accountType, Integer accountId, Double accountBalance){
         accountList.put(accountType,accountId);
         accountBalanceList.put(accountId,accountBalance);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getAccountType(){
        return accountType;
    }

    public Integer getAccountId(){
        return accountId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void displayCustomerDetails(){
        System.out.println("Customer Name- " + getName());
        System.out.println("Customer's Phone number- " + getPhoneNo());
        System.out.println("Customer ID- " + getCustomerId());
        System.out.println("Accounts in the Bank:");
        accountList.forEach((k,v) -> System.out.println(" Account Type= " + k + ", Account ID = " + v));
        System.out.println();
    }

}

//   Customer: To store information about the customers of the bank