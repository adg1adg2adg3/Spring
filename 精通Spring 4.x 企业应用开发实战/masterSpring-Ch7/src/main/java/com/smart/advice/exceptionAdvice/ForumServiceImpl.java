package com.smart.advice.exceptionAdvice;

import java.sql.SQLException;

public class ForumServiceImpl implements ForumService {

    public void removeTopicId(int topicId){
        throw new RuntimeException("运行异常。");
    }

    public void updateTopicId(int topicId) throws SQLException {
        throw new SQLException("数据库更新异常。");
    }
}
