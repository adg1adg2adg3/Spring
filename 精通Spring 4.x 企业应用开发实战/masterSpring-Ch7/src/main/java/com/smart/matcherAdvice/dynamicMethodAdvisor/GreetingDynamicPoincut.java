package com.smart.matcherAdvice.dynamicMethodAdvisor;

import com.smart.matcherAdvice.Waiter;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GreetingDynamicPoincut extends DynamicMethodMatcherPointcut {

    private static List<String> specialClientList = new ArrayList<String>();

    static {
        specialClientList.add("b");
    }

    public ClassFilter getClassFilter(){
        return new ClassFilter() {
            public boolean matches(Class<?> aClass) {
                System.out.println("调用getClassFilter()对" + aClass.getName() + "做静态检查");
                return Waiter.class.isAssignableFrom(aClass);
            }
        };
    }

    public boolean matches(Method method, Class clazz) {
        System.out.println("调用matches(method,clazz)" + clazz.getName() + "::"
        +method.getName() + "做静态检查");
        return "greetTo".equals(method.getName());
    }

    public boolean matches(Method method, Class<?> aClass, Object[] objects) {
        System.out.println("调用matches(method,aClass,objects)" + aClass.getName()
                + "::" + method.getName() + "做动态检查");

        String clientName = (String) objects[0];
        return specialClientList.contains(clientName);

    }

}
