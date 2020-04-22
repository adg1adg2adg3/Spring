package com.smart.AspectjExample.annotationAdvisor;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectDing {

    //所有执行MyAnnotation注解的都会执行此增强
    @AfterReturning("@annotation(com.smart.aSimpleAnnotation.MyAnnotation)")
    public void AdvisorNotice(){
        System.out.println("Ding..");
    }
}
