package com.smart.proxy.cglibProxy;

public class ForumServiceImpl implements ForumService {


    /*一个具有显式横切代码的实现类，稍后会用代理消灭显式横切代码*/

    public void createTopic(int topicId) throws InterruptedException {
        System.out.println("业务代码" + topicId);
        Thread.currentThread().sleep(20);
    }

    public void removeTopic(int topicId) throws InterruptedException {
        System.out.println("业务代码" + topicId);
        Thread.currentThread().sleep(20);
    }
}
