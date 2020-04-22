package com.smart.AspectjExample.annotationAdvisor;

import com.smart.AspectjExample.Waiter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainAnnotationAdvisor {

    public static void main(String[] args) {


        String configPath = "AspectjExample\\annotationAdvisor\\advisor-config.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configPath);

        Waiter naughtyWaiter = (Waiter) classPathXmlApplicationContext.getBean("naughtyWaiter");
        Waiter naiveWaiter = (Waiter) classPathXmlApplicationContext.getBean("naiveWaiter");

        naughtyWaiter.greetTo("a");
        naughtyWaiter.serveTo("a");

        naiveWaiter.greetTo("a");
        naiveWaiter.serveTo("a");
    }
}
