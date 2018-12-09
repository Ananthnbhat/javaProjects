package com.aopExample.aopDemo.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation{
    @Pointcut("execution(* Operation.m*(..))")
    public void forM(){}//pointcut name

    @Pointcut("execution(* Operation.k*(..))")
    public void forK(){}

    @Before("forM()")//applying pointcut on before advice
    public void myadvice(JoinPoint jp)//it is advice (before advice)
    {
        System.out.println("something to print or do before the method starting with 'm' starts");
    }

    @After("forK()")
    public void myAnotherAdvice(JoinPoint joinPoint){
        System.out.println("something to print or do after the method starting with 'k' starts");
    }

    //like before, there is After
}