package com.mybatis.reflectExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectCar {

    public static Car initByDefaultConst() throws Throwable {

        /* 获取当前线程的ClassLoader */
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        /* 通过指定全限定类名装载Car类对应的反射对象 */
        Class carClass = loader.loadClass("com.mybatis.reflectExample.Car");

        /* 通过Car类对应的反射实例获取Car的构造函数实例 */
        Constructor carConstructor = carClass.getDeclaredConstructor((Class[]) null);
        /* 通过Car的构造函数对象实例化Car */
        Car car = (Car) carConstructor.newInstance();

        /* 通过Car类对应反射实例的getMethod方法获取方法反射实例 */
        /* 第一个参数为目标Class的方法名，第二个参数为目标Class方法传递的对象类型 */
        Method setBrand = carClass.getMethod("setBrand", String.class);
        Method setColor = carClass.getMethod("setColor", String.class);
        Method setMaxSpeed = carClass.getMethod("setMaxSpeed", int.class);
        /* 获取方法反射实例后通过invoke方法调用目标实例的方法 */
        /* 第一个参数为目标实例，第二个参数为要传递的参数 */
        setBrand.invoke(car,"红旗CA72");
        setColor.invoke(car,"黑色");
        setMaxSpeed.invoke(car,200);


        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        System.out.println(car);
    }

}
