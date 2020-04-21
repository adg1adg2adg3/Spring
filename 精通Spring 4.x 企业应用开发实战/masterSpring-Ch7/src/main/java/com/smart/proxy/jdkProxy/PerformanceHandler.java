package com.smart.proxy.jdkProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {

    private Object target;

    public PerformanceHandler(Object service) {
        this.target = service;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName() +
                "::" + method.getName());
        Object invoke = method.invoke(target, args);    //通过反射调用业务类的目标方法
        PerformanceMonitor.end();
        System.out.println("-----------------");
        return invoke;
    }
}
