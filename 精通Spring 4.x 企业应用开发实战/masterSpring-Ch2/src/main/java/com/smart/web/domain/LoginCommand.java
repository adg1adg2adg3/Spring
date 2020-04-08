package com.smart.web.domain;

public class LoginCommand {

    private String userName;
    private String password;

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginCommand{" +
                "username='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
