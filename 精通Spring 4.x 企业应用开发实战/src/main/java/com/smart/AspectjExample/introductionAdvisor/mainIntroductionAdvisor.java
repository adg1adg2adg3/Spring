package com.smart.AspectjExample.introductionAdvisor;

import com.smart.AspectjExample.Waiter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainIntroductionAdvisor {

    public static void main(String[] args) {

        String configPath = "\\AspectjExample\\introductionAdvisor\\advisor-config.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configPath);

        Waiter waiter = (Waiter) classPathXmlApplicationContext.getBean("waiter");

        waiter.greetTo("a");
        waiter.serveTo("a");
        Seller seller = (Seller) waiter;
        seller.sell("a");
    }
}
