package com.example.EmployeeDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOne {
    private String name,designation;
    private int employeeID;

    EmployeeOne() {
        setName("Sakshi Sonalkar");
        setEmployeeID(101);
        setDesignation("Java Developer");
    }

    @Autowired
    private EmployeeTwo employeeTwo;

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void details(){
        System.out.println("Employee Name- " + getName());
        System.out.println("Employee ID - " + getEmployeeID());
        System.out.println("Job Title- " + getDesignation());
        System.out.println();
        employeeTwo.display();
    }
}
