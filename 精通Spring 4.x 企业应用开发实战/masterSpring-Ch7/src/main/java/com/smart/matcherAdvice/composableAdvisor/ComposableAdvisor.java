package com.smart.matcherAdvice.composableAdvisor;

import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class ComposableAdvisor {

    public Pointcut getIntersectionPointcut(){
        ComposablePointcut composablePointcut = new ComposablePointcut();

        Pointcut service = new ControlFlowPointcut(WaiterDelegate.class, "service");

        NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();
        nameMatchMethodPointcut.addMethodName("greetTo");
        composablePointcut.intersection(service);
        return composablePointcut.intersection((MethodMatcher) nameMatchMethodPointcut);
    }
}
