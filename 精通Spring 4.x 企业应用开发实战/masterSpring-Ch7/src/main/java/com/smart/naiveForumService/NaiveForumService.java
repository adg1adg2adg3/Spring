package com.smart.naiveForumService;

public class NaiveForumService {

    /*业务代码淹没在非业务代码之中*/

    public void removeTopic(){
        System.out.println("事务处理启动");
        System.out.println("性能监控启动");

        System.out.println("业务代码");

        System.out.println("性能监控关闭");
        System.out.println("事务处理关闭");
    }

    public void createTopic(){
        System.out.println("事务处理启动");
        System.out.println("性能监控启动");

        System.out.println("业务代码");

        System.out.println("性能监控关闭");
        System.out.println("事务处理关闭");
    }
}
