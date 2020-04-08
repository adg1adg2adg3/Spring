package com.smart.loginLog.dao;

import com.smart.loginLog.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//标注一个为服务层的Bean
@Repository
public class LoginLogDao {

    private JdbcTemplate jdbcTemplate;

    private final static String INSERT_LOGIN_LOG_SQL
            = " insert into t_login_log(user_id,ip,login_datetime) "
            + " values( ?, ?, ?) ";

    public void insertLoginLog(LoginLog loginLog){

        Object[] args = { loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDate() };

        jdbcTemplate.update(INSERT_LOGIN_LOG_SQL,args);
    }

    //标注为DAO层的Bean
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


}
