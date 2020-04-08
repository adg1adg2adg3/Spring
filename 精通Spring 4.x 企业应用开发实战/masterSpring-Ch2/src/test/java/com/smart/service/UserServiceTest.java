package com.smart.service;

import com.smart.user.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//注解SpringSpringJUnit支持，由此引入Spring-Test框架支持。
// 启动Spring容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/smart-context.xml")
public class UserServiceTest {

    private static UserService userService;

    //标注为DAO层的Bean
    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @Test
    public void testHasMatchUser(){
        boolean b1 = userService.hasMatchUser("admin", "123456");
        boolean b2 = userService.hasMatchUser("admin", "1111");
        System.out.println(b1);
        System.out.println(b2);
    }

    @Test
    public void testFindUserByUserName(){
        User user = userService.findUserByUserName("admin");
        System.out.println(user);
    }
}
