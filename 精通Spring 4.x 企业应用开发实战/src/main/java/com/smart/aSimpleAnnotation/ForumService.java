package com.smart.aSimpleAnnotation;

public class ForumService {

    @MyAnnotation(true)
    public void deleteTopic(int TopicId){
        System.out.println("删除帖子");
    }

    @MyAnnotation(false)
    public void createTopic(int TopicId){
        System.out.println("创建帖子");
    }
}
