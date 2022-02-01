package com.bank.AbcBank.entity;

import javax.persistence.*;


@Entity
    public class Account {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(name = "accountId",nullable = false,unique = true)
        private Long accountId;
        @Column(name = "customerName", nullable = false)
        private String customerName;
        @Column(name = "email", nullable = false)
        private String email;
        @Column(name="phoneNumber",nullable = false)
        private String phoneNumber;
        @Column(name = "accountType", nullable = false)
        private String accountType;
        @Column(name="IFSCCode",nullable=false)
        private String ifscCode;
        @Column(name="branchName",nullable = false)
        private String branchName;
        @Column(name="balance")
        private Double accountBalance;

        @OneToOne(mappedBy="account")
        private Customer customer;

        public Account(){

        }
        public Account(String customerName, String phoneNumber,Double accountBalance, Customer customer, String email, String accountType,String branchName,String ifscCode) {
            this.customerName = customerName;
            this.email=email;
            this.phoneNumber=phoneNumber;
            this.accountType=accountType;
            this.accountBalance = accountBalance;
            this.customer = customer;
            this.ifscCode=ifscCode;
            this.branchName=branchName;
        }

        public Long getId() {
            return accountId;
        }

        public void setId(Long id) {
            this.accountId = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public Double getAccountBalance() {
            return accountBalance;
        }

        public void setAccountBalance(Double accountBalance) {
            this.accountBalance = accountBalance;
        }

        public String getIfscCode() {
            return ifscCode;
        }

        public void setIfscCode(String IFSCCode) {
            this.ifscCode = IFSCCode;
        }

        public String getBranchName() {
            return branchName;
        }

        public void setBranchName(String branchName) {
            this.branchName = branchName;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }
    }

