package com.smart.proxy.jdkProxy;

public class ForumServiceImpl implements ForumService {


    /*使用JDK动态代理编制横切逻辑与业务逻辑*/

    public void createTopic(int topicId){
        System.out.println("业务代码" + topicId);
        try {
            Thread.currentThread().sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void removeTopic(int topicId){
        System.out.println("业务代码" + topicId);
        try {
            Thread.currentThread().sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
