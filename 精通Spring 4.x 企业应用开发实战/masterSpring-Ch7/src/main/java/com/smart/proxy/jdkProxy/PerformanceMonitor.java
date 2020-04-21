package com.smart.proxy.jdkProxy;

public class PerformanceMonitor {

    private static ThreadLocal<MethodPerformance> record = new ThreadLocal<MethodPerformance>();

    //在当前线程保存一个计时器
    public static void begin(String method){
        System.out.println("begin monitor");
        MethodPerformance methodPerformance = new MethodPerformance(method);
        record.set(methodPerformance);
    }

    //取出当前线程的计时器
    public static void end(){
        System.out.println("end monitor");
        MethodPerformance methodPerformance = record.get();
        methodPerformance.printPerformance();
    }
}
