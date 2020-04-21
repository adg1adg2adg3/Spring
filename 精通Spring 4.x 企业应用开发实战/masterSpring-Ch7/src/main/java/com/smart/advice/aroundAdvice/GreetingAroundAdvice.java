package com.smart.advice.aroundAdvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetingAroundAdvice implements MethodInterceptor {


    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        Object[] arguments = methodInvocation.getArguments();
        String argument = (String) arguments[0];
        System.out.println("How are you! Mr." + argument + ".");
        Object proceed = methodInvocation.proceed();  //通过反射调用目标方法
        System.out.println("Please enjoy yourself!");

        return proceed;
    }
}
