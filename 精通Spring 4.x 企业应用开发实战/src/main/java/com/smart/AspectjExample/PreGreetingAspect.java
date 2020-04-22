package com.smart.AspectjExample;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreGreetingAspect {

    @Before("execution(* greetTo(..))")//切点表达式函数
    public void beforeGreeting(){
        System.out.println("How are you");
    }
}
