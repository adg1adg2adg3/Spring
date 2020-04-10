package com.spring.chapter2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWordTest {

    @Test
    public void testHelloWord(){
        //读取配置文件实例化一个IoC容器
        //ApplicationContext为BeanFactory的子类并提供了跟多功能
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/chapter2/helloWord.xml");
        //从容器中获取Bean，注意此处要面向接口编程，实现类在bean的配置文件里
        HelloWorld helloWorld = context.getBean("hello", HelloWorld.class);
        //bean执行方法
        helloWorld.sayHello();
    }
}
