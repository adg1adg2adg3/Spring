package com.smart.proxy.jdkProxy;

public class MethodPerformance {
    private String serviceMethod;
    private long begin;
    private long end;

    public MethodPerformance(String method) {
        this.serviceMethod = method;
        this.begin = System.currentTimeMillis();
    }


    public void printPerformance(){
        this.end = System.currentTimeMillis();
        long elapse = end - begin;
        System.out.println("JDK:" + serviceMethod + "花费" + elapse + "毫秒");
    }

    public void reset(String serviceMethod){
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }
}
