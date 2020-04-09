package com.mybatis.context;

import com.mybatis.reflectExample.Car;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplicationContextText {


    /* 通过注解创建和配置Bean */
    @Test
    public void getBean() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Beans.class);
        Car car = annotationConfigApplicationContext.getBean("car", Car.class);
        System.out.println(car);
    }
}
