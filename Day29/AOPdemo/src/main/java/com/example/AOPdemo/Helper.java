package com.example.AOPdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Helper {
    @Before("execution(public void show*(int))")
    public void log(){
        System.out.println("Before calling shown function");
    }
    @After("execution(public void display*())")
    public void afterLog(){
        System.out.println("After calling display*()");
    }

    @Pointcut("execution(public void display*())")
    public void pointcut(){
    }

    @Before("pointcut()")
    public void before(){

        System.out.println("Before Display* function execution");
    }
    @After("pointcut()")
    public void after(){

        System.out.println("After Display* function execution");
    }


    @Around("pointcut()")
    public void aroundLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("before");
        proceedingJoinPoint.proceed();
        System.out.println("after");
    }

    @AfterReturning("execution(public void setDetails(int,String))")
    public void logAfterReturning()   {
        System.out.println("After Returning exception in method ");

    }


    @AfterThrowing("execution(public void setDetails(int,String))")
    public void logAfterThrowing() {
        System.out.println("After Throwing exception in method ");

    }

}
