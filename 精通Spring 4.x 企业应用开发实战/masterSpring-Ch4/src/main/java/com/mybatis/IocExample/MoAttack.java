package com.mybatis.IocExample;

public class MoAttack {

    private GeLi geli;

    /* 使用setter注入 */
    public void setGeLi(GeLi geli){
        this.geli = geli;
    }

    /* 实现功能 */
    public void act(){
        geli.act();
    }

}
