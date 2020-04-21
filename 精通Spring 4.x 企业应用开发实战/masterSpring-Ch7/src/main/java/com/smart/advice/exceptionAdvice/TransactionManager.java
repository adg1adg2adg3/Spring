package com.smart.advice.exceptionAdvice;

import org.springframework.aop.ThrowsAdvice;
import java.lang.reflect.Method;

public class TransactionManager implements ThrowsAdvice {

    //ThrowsAdvice为标签接口，但可以定义afterThrowing方法。
    //afterThrowing的传参前三个要么都提供，要么都不提供，第四个传参为Throwable及其子类。
    //当有多个afterThrowing时Spring会自动选择匹配的增强算法。
    public void afterThrowing(Method method,Object[] args, Object target, Exception ex)
     throws Throwable{

        System.out.println("------");
        System.out.println("method: " + method.getName());
        System.out.println("抛出异常：" + ex.getMessage());
        System.out.println("成功回滚事务");
    }
}
