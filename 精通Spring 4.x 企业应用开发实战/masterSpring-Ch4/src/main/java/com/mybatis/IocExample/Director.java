package com.mybatis.IocExample;

public class Director {

    public void direct(){

        GeLi geli = new LiuDeHua();
        MoAttack moAttack = new MoAttack();

        moAttack.setGeLi(geli);

        moAttack.act();

        /* 这个类实现了控制反转使得MoAttack不直接依赖于GeLi和LiuDeHua */
    }

}
