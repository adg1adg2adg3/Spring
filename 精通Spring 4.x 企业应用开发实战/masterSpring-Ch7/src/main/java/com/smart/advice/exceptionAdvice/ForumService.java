package com.smart.advice.exceptionAdvice;

import java.sql.SQLException;

public interface ForumService {

    public void removeTopicId(int topicId);

    public void updateTopicId(int topicId) throws SQLException;
}
