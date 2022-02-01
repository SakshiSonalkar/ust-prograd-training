package com.bank.AbcBank.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "customerName", nullable = false)
    private String customerName;
    @Column(name = "userName", nullable = false)
    private String userName;
    @Column(name="phoneNumber",nullable = false)
    private String phoneNumber;
    @Column(name="password", nullable = false)
    private String password;

    @JsonIgnore
    @OneToOne
    private Account account;

    public Customer(){

    }

    public Customer(String customerName, String userName, String phoneNumber,String password) {
       setCustomerName(customerName);
        setUserName(userName);
        setPhoneNumber(phoneNumber);
        setPassword(password);
    }

//    public Customer(Long id,String name, String userName, String phoneNumber,String password) {
//        this.id=id;
//        this.name = name;
//        this.userName = userName;
//        this.phoneNumber=phoneNumber;
//        this.password = password;
//    }

//    public Customer(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
//    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
