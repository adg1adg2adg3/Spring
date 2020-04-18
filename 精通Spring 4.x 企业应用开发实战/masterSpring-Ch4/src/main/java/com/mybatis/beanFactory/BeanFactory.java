package com.mybatis.beanFactory;

import com.mybatis.reflectExample.Car;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

public class BeanFactory {

    /* 通过读取XML创建和配置Bean */
    @Test
    public void getBean() throws IOException {

        /* 获取配置文件位置并封装到Resource类中 */
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:com/mybatis/beanfactory/beans.xml");
        System.out.println(res.getURL());

        /* 启动IoC */
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        /* 读取配置信息 */
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);

        //使用ApplicationContext类则会简单许多

        System.out.println("init BeanFactory.");

        Car car = factory.getBean("car", Car.class);
        System.out.println("car bean is ready for use!");
        System.out.println(car);
    }
}
