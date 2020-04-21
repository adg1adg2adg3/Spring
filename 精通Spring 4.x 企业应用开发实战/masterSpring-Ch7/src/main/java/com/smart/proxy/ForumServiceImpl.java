package com.smart.proxy;

public class ForumServiceImpl implements ForumService {


    /*一个具有显式横切代码的实现类，稍后会用代理消灭显式横切代码*/

    public void createTopic(int topicId) throws InterruptedException {
        PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl::createTopic");
        System.out.println("业务代码" + topicId);
        Thread.currentThread().sleep(20);
        PerformanceMonitor.end();
    }

    public void removeTopic(int topicId) throws InterruptedException {
        PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl::removeTopic");
        System.out.println("业务代码" + topicId);
        Thread.currentThread().sleep(20);
        PerformanceMonitor.end();
    }
}
