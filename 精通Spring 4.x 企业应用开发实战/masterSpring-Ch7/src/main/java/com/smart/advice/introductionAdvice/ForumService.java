package com.smart.advice.introductionAdvice;

public interface ForumService {

    public void createTopic(int topicId) throws InterruptedException;

    public void removeTopic(int topicId) throws InterruptedException;
}
