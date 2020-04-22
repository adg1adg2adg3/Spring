package com.smart.AspectjExample.introductionAdvisor;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EnableSellerAspect {

    @DeclareParents(value = "com.smart.AspectjExample.NaiveWaiter",
    defaultImpl = SmartSeller.class)
    public Seller seller;
}
