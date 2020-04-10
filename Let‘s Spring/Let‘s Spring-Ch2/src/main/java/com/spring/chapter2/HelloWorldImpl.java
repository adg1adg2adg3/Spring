package com.spring.chapter2;

public class HelloWorldImpl implements HelloWorld {

    private String name;

    public void HelloWorld (String string){
        this.name = string;
    }

    public void sayHello() {
        System.out.println("Hello World!");
    }

    public void myName(){
        System.out.println(name);
    }
}
