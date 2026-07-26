package com.cognizant.librarymanagement.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.cognizant.librarymanagement.service.*.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("Before : " + jp.getSignature().getName());
    }

    @After("execution(* com.cognizant.librarymanagement.service.*.*(..))")
    public void after(JoinPoint jp) {
        System.out.println("After : " + jp.getSignature().getName());
    }
}