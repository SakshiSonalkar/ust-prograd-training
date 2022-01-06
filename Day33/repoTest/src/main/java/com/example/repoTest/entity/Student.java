package com.example.repoTest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
   @Id
   @GeneratedValue
   private Long id;
   @Column(nullable=false)
    private String name;
   @Column(nullable = false , unique= true)
    private String email;
   @Column(nullable = false)
    private Integer age;

   public Student(){}

   public Student(String name,String email,Integer age){
       setName(name);
       setEmail(email);
       setAge(age);
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
