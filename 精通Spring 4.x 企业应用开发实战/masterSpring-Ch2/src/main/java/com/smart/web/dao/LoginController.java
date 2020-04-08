package com.smart.web.dao;

import com.smart.service.UserService;
import com.smart.user.domain.User;
import com.smart.web.domain.LoginCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

//标注为控制层Bean
@Controller
public class LoginController {

    private UserService userService;

    //指定方法如何映射请求路径
    @RequestMapping(value = "/index.html")
    public String loginPage(){
        return "login";
    }

    //指定方法如何映射请求路径
    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand){
        System.out.println(loginCommand);
        boolean isValidUser = userService.hasMatchUser(loginCommand.getUsername(), loginCommand.getPassword());
        System.out.println(isValidUser);
        if (!isValidUser){
            return new ModelAndView("login", "error", "用户名或密码错误");
        } else {
            User user = userService.findUserByUserName(loginCommand.getUsername());
            user.setLastIp(request.getLocalAddr());
            user.setLastVist(new Date());
            userService.loginSuccess(user);
            request.getSession().setAttribute("user",user);
            return new ModelAndView("main");
        }
    }

    //标注为DAO层的Bean
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
