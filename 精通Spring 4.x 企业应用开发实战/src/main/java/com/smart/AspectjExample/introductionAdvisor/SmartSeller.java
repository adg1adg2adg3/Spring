package com.smart.AspectjExample.introductionAdvisor;

public class SmartSeller implements Seller {

    public void sell(String clientName){
        System.out.println("Sell good to " + clientName);
    }
}
