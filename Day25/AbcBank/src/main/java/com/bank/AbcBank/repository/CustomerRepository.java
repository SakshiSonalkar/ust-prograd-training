package com.bank.AbcBank.repository;

import com.bank.AbcBank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Map;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query("Select user from Customer user where user.userName=:Uname")
    Customer findById(@Param("Uname") String userName);

}
