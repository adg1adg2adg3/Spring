package com.smart.AspectjExample;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

public class mainWaiter {
    public static void main(String[] args) {

        NaiveWaiter waiter = new NaiveWaiter();

        AspectJProxyFactory factory = new AspectJProxyFactory();

        factory.setTarget(waiter);
        factory.addAspect(PreGreetingAspect.class);

        Waiter proxy = (Waiter) factory.getProxy();

        proxy.greetTo("a");
        proxy.serveTo("a");
    }
}
