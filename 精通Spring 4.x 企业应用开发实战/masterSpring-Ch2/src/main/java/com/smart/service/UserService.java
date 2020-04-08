package com.smart.service;

import com.smart.loginLog.dao.LoginLogDao;
import com.smart.loginLog.domain.LoginLog;
import com.smart.user.dao.UserDao;
import com.smart.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//标注一个为服务层的Bean
@Service
public class UserService {

    private UserDao userDao;
    private LoginLogDao loginLogDao;

    //标注为DAO层的Bean
    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    //标注为DAO层的Bean
    @Autowired
    public void setLoginLogDao(LoginLogDao loginLogDao){
        this.loginLogDao = loginLogDao;
    }

    public boolean hasMatchUser(String userName,String password){
        int matchCount = userDao.getMatchCount(userName, password);
        return matchCount > 0;
    }

    public User findUserByUserName(String userName){
        return userDao.findUserByUserName(userName);
    }

    //声明事务
    @Transactional
    public void loginSuccess(User user){
        user.setCredits( 5 + user.getCredits() );
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVist());
        userDao.updateLoginInfo(user);
        loginLogDao.insertLoginLog(loginLog);
    }

}
