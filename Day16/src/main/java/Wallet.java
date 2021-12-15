import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Wallet {

        private double balAmount = 0;

        public double converter(double amount, String toAmount) {
            if(amount<=0){
                throw new IllegalArgumentException("Amount can't less than or equal to zero");
            }
            switch (toAmount) {
                case "INR":
                    return amount * 74.85;
                case "USD":
                    return amount / 74.85;
                default:
                    throw new IllegalArgumentException("preferred currency is not valid");
            }
        }

        public double depositAmount(double amount, String toAmount) {
            switch (toAmount) {
                case "INR":
                    this.balAmount = this.balAmount + converter(amount,"INR");
                    return balAmount;
                case "USD":
                    this.balAmount = this.balAmount + converter(amount,"USD");
                    return balAmount;
            }
            return 0;
        }

        public double withdrawAmount(double amount) {
            if(balAmount<amount){
                throw new IllegalArgumentException("No Sufficient balance");
            }
            return  balAmount - amount;
        }

        public double getBalAmount(){
            return balAmount;
        }
    }

//    As a wallet owner, I would like to be able to know that 74.85 rupees is equal to 1 dollar.
//    As a wallet owner I would like to be able to put money into my wallet so that I can take it out later.
//    As a wallet owner, I want to know the total money in wallet has for the preferred currency.
//    When Rs.50 & $1 added to my wallet, Then the sum of money in the wallet is Rs.124.85, (Given preferred currency is Rs.)

//    As a wallet owner, I want to know the total money my wallet has for the preferred currency.
//    When Rs.74.85, $1, Rs.149.7 added to my wallet, Then sum of money in the wallet is $4, (Given preferred currency is $)
//    As a wallet owner I would like to be able to take a specified amount of money out of the wallet.
