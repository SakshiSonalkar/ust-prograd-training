package com.bank.AbcBank.service;

import com.bank.AbcBank.entity.Account;
import com.bank.AbcBank.entity.Customer;
import com.bank.AbcBank.repository.AccountRepository;
import com.bank.AbcBank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

        @Autowired
        private CustomerRepository customerRepository;
        @Autowired
        private AccountRepository accountRepository;


        public Customer saveCustomer(Customer customer){
            return customerRepository.save(customer);
        }

        public Customer getCustomerById(Long id){
            return  customerRepository.getById(id);
        }

        public Customer findByCustomerId(String userName) {
            return customerRepository.findById(userName);
        }

        public Account saveAccount(Account account) {
            return accountRepository.save(account);
        }

        public Account getAccountByAccountId(Long accountId){
            return accountRepository.getById(accountId);
        }

        public Account findByAccountId(Long accountId){
            return accountRepository.findById(accountId).get();
        }

        public List<Customer> listOfCustomers() { return customerRepository.findAll(); }

        public List<Account> accountList() {
             return accountRepository.findAll();
        }
    }

