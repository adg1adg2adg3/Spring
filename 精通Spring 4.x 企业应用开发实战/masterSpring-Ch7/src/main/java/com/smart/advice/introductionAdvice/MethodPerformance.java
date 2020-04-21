package com.smart.advice.introductionAdvice;

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
        System.out.println(serviceMethod + "花费" + elapse + "毫秒");
    }

}
