package com.bankApplication.Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BankApplication.class, args);
		Customer customer1 = context.getBean(Customer.class);
		Customer customer2 = context.getBean(Customer.class);

		FundTransfer fundTransfer=context.getBean(FundTransfer.class);
		customer1.setCustomerDetails("Sakshi Sonalkar","9977886652",101);
		customer1.setAccountDetails("Savings Account",401234567, 3000.0);
		customer1.setAccountDetails("Fixed Deposit",123456782, 45000.0);
		customer1.displayCustomerDetails();
		customer2.setCustomerDetails("Shruti Sonalkar","9977886651",102);
		customer2.setAccountDetails("Savings Account",401234561, 3000.0);

		customer2.displayCustomerDetails();
		fundTransfer.fundTransfer(500.0,customer1,401234567,customer2,401234561);






	}

}
// Create a Spring Boot application for ABC Bank. using this application,
// the customers of the bank should be able to access their account details and transfer funds to the other accounts of the same bank.
// This application should consist of the following entities:
//    Customer: To store information about the customers of the bank
//    BankAccount:To store information about the existing accounts of the bank
//    FundTransfer: To store information about the funds that are transferred from one account to the other.
//    Create the application and inject dependencies in the entities.