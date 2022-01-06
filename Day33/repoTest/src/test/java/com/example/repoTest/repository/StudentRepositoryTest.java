package com.example.repoTest.repository;

import com.example.repoTest.entity.Student;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest                //connect with local testdatabase instead of main database
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repo;

    @BeforeEach
    public void setup(){
        Student kokila = new Student("Kokila","kokila@gmail.com",22);
        repo.save(kokila);        // saves student in dummy database
    }

    @AfterEach
    public void tearDown(){
        repo.deleteAll();        //for eg,having two other tests that might change data in database,deleteAll helps to delete data after each test,so no inconsistency
    }
    @Nested
    class CheckIfEmailExistsOrNot{
       @Test
        public void returnsTrueIfEmailExists(){
           Boolean actual = repo.checkIfEmailExists("kokila@gmail.com");
           //Assertions.assertEquals(true,actual) is same as
           Assertions.assertTrue(actual);
        }

        @Test
        public void returnsFalseIfEmailDoesNotExist(){
            Boolean actual = repo.checkIfEmailExists("sakshi@gmail.com");
            //Assertions.assertEquals(false,actual) is same as
            Assertions.assertFalse(actual);
        }

    }

}