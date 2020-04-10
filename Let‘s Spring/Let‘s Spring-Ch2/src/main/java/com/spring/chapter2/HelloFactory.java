package com.spring.chapter2;

public class HelloFactory {

    public HelloWorld GiveMeAHelloWord(){
        return new HelloWorldImpl();
    }
}
