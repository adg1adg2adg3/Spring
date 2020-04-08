package com.smart.user.dao;


import com.smart.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;


//标注一个为服务层的Bean
@Repository
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    private final static String MATCH_COUNT_SQL = " select * from "
            + " t_user where user_name = ?";

    private final static String UPDATE_INFO_SQL = " update t_user set "
            + " last_visit = ? ,last_ip = ? ,credits = ? where user_id = ?";

    //标注为DAO层的Bean
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getMatchCount(String username,String password){
        String sqlStr = " select count(*) from t_user "
                + " where user_name = ? and password = ?";
        return jdbcTemplate.queryForObject(sqlStr,new Object[] {username,password},Integer.class );
    }

    public User findUserByUserName(final String username){
        final User user = new User();

        jdbcTemplate.query(MATCH_COUNT_SQL, new Object[]{username},
                new RowCallbackHandler() {
                    public void processRow(ResultSet resultSet) throws SQLException {
                        user.setUserId(resultSet.getInt("user_id"));
                        user.setUserName(username);
                        user.setCredits(resultSet.getInt("credits"));
                    }
                }
        );

        return user;
    }

    public void updateLoginInfo(User user){
        jdbcTemplate.update(UPDATE_INFO_SQL,new Object[] { user.getLastVist(),
        user.getLastIp(), user.getCredits(), user.getUserId() });
    }

}
