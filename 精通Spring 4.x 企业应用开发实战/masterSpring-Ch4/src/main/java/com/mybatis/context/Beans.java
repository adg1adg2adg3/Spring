package com.mybatis.context;

import com.mybatis.reflectExample.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//表示是一个配置信息提供类
@Configuration
public class Beans {

    //定义一个Bean
    @Bean(name = "car")
    public Car buildCar(){
        Car car = new Car();
        car.setBrand("红旗CA72");
        car.setColor("黑色");
        car.setMaxSpeed(200);
        return car;
    }
}
