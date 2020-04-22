package com.smart.AspectjExample.annotationAdvisor;


import com.smart.AspectjExample.Waiter;
import com.smart.aSimpleAnnotation.MyAnnotation;


public class NaughtyWaiter implements Waiter {

    @MyAnnotation
    public void greetTo(String clientName){
        System.out.println("NaughtyWaiter::greet to " + clientName + "...");
    }

    @MyAnnotation
    public void serveTo(String clientName){
        System.out.println("NaughtyWaiter::serving " + clientName + "...");
    }
}
